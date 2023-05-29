package behavioral.observer.ex3.notifier;

import behavioral.observer.ex3.LoginStatus;
import behavioral.observer.ex3.Observer;
import behavioral.observer.ex3.User;

public class Protector implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID){
            System.out.println(
                    "Protector: user" + user.getEmail() + "is invalid. " +
                    "\nIP" + user.getIp() + "is blocked");
        }
    }
}
