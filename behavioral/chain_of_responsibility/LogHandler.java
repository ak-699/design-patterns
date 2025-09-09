package behavioral.chain_of_responsibility;

public class LogHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request req) {
        if ("LOG".equals(req.getType())) {
            System.out.println("Req handled by log.");
        } else {
            if (next != null)
                next.handle(req);
        }
    }

}
