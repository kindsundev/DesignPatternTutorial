package behavioral.observer.ex3.notifier;

import behavioral.observer.ex3.Observer;
import behavioral.observer.ex3.User;

public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}
