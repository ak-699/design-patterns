# Chain of Responsibility

### Quick Steps

1. Handler
2. Concrete handler
3. Request
4. Set up chain

# Core idea

- Each handler and ref to next handler
- Each handler either process it or pass to next handler
- OCP - extend handlers without modifying others

# Demo

- Handler

```java
public interface Handler {
    void setNext(Handler handler);
    void handle(Request request);
}
```

- Concrete handler

```java
public class AuthHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        if ("AUTH".equals(request.getType())) {
            System.out.println("AuthHandler handled the request");
        } else if (next != null) {
            next.handle(request);
        }
    }
}

public class LoggingHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request) {
        if ("LOG".equals(request.getType())) {
            System.out.println("LoggingHandler handled the request");
        } else if (next != null) {
            next.handle(request);
        }
    }
}
```

- Request

```java
public class Request {
    private String type;
    public Request(String type) { this.type = type; }
    public String getType() { return type; }
}
```

- Set up chain

```java
public class Main {
    public static void main(String[] args) {
        Handler auth = new AuthHandler();
        Handler logging = new LoggingHandler();

        auth.setNext(logging); // Chain: Auth -> Logging

        Request req1 = new Request("AUTH");
        Request req2 = new Request("LOG");

        auth.handle(req1); // Output: AuthHandler handled the request
        auth.handle(req2); // Output: LoggingHandler handled the request
    }
}
```
