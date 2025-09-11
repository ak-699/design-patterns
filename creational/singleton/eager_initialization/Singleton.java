package creational.singleton.eager_initialization;

public class Singleton {
    private static final Singleton instance = new Singleton();

    public Singleton() {
        System.out.println("constructing...");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
