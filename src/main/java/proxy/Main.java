package proxy;

public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy("DATABASE");
        proxy.connect();
    }
}
