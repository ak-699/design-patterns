package structural.adapter.book;

public class Demo {
    public static void main(String[] args) {
        Book paperBook = new PaperBook();
        paperBook.read();
        Book eBook = new EBookAdapter(new EBook());
        eBook.read();
    }
}
