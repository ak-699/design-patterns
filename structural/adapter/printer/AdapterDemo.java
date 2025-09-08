package structural.adapter.printer;

public class AdapterDemo {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        Printer printer = new PrinterAdapter(oldPrinter);
        printer.print("Hello from printer");
    }
}
