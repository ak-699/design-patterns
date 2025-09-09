package behavioral.chain_of_responsibility;

public class AuthHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request req) {
        if ("AUTH".equals(req.getType())) {
            System.out.println("Req handled by auth");
        } else {
            if (next != null)
                next.handle(req);
        }
    }

}
