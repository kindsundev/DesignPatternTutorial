package behavioral.observer.ex3.notifier;

import behavioral.observer.ex3.LoginStatus;
import behavioral.observer.ex3.Observer;
import behavioral.observer.ex3.User;

public class Mailer implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRED){
            System.out.println("Mailer: User: " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}
