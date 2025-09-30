package structural.adapter.book;

public class EBookAdapter implements Book {
    EBook eBook;

    public EBookAdapter(EBook eBook) {
        this.eBook = eBook;
    }

    @Override
    public void read() {
        System.out.println("Adapter");
        eBook.openFile();
    }

}
