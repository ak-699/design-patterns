package structural.proxy.lazy_loading.image;

public class ProxyDemo {
    public static void main(String[] args) {
        Image imageProxy = new ImageProxy("hello.png");
        imageProxy.display();
    }
}
