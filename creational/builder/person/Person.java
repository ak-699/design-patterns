package creational.builder.person;

public class Person {
    private String name;
    private int age;
    private String phone;
    private String email;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static class Builder {
        private String name;
        private int age;
        private String phone;
        private String email;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email + "]";
    }

}
