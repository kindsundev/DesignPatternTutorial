package structural.proxy;

public class ClientTest {
    public static void main(String[] args) {
//        Remote remoteProxy = new LazyRemoteProxy();
//        remoteProxy.turnOn();
//        remoteProxy.turnOff();

        ProxyImage proxy = new ProxyImage("https://abc.com/dev.png");
        System.out.println("First load");
        proxy.load();
        System.out.println("Second load");
        proxy.load();
    }
}
