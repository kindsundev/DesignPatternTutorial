package creational.singleton;

public class ThreadSafe {
    private static volatile ThreadSafe instance;

    private static synchronized ThreadSafe getInstance() {
        if (instance == null) {
            instance = new ThreadSafe();
        }
        return instance;
    }
}
