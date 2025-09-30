package structural.adapter.book;

public class PaperBook implements Book {

    @Override
    public void read() {
        System.out.println("Reading paper book");
    }

}
