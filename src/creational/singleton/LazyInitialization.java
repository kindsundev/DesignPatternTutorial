package creational.singleton;

public class LazyInitialization {
    private static LazyInitialization instance;

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
