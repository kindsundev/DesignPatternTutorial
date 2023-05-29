package structural.proxy;

public class LazyRemoteProxy implements Remote{
    private RemoteImp remote = null;

    @Override
    public void turnOn() {
        System.out.println("Wrapee " + remote);
        if (this.remote == null) {
            remote = new RemoteImp();
        }
        this.remote.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Wrapee " + remote);
        if (this.remote == null) {
            remote = new RemoteImp();
        }
        this.remote.turnOff();
    }
}
