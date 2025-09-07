package creational.builder.person;

public class BuilderDemo {
    public static void main(String[] args) {
        Person abhishek = new Person.Builder("Abhishek", 23).build();
        Person pooja = new Person.Builder("Pooja", 26)
                .phone("2222222222")
                .email("pooja@gmail.com")
                .build();
        System.out.println(abhishek.toString());
        System.out.println(pooja.toString());
    }
}
