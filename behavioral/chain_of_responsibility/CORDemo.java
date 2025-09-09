package behavioral.chain_of_responsibility;

public class CORDemo {
    public static void main(String[] args) {
        Handler authHandler = new AuthHandler();
        Handler logHandler = new LogHandler();

        authHandler.setNext(logHandler);

        Request req1 = new Request("AUTH");
        Request req2 = new Request("LOG");

        authHandler.handle(req1);
        authHandler.handle(req2);
        logHandler.handle(req2);

    }
}
