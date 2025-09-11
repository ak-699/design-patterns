package creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Book book = new Book("h", "h");
        Book copy = book.clone();
        System.out.println(book.toString());
        System.out.println(copy.toString());
        if (book == copy) {
            System.out.println("both are same");
        }
    }
}
