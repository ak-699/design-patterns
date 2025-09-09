package behavioral.chain_of_responsibility;

public interface Handler {
    void setNext(Handler handler);

    void handle(Request req);
}
