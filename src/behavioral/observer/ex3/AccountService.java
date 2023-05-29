package behavioral.observer.ex3;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject{

    private User user;

    private List<Observer> observerList = new ArrayList<>();

    public AccountService(String email, String ip) {
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update(user);
        }
    }

    public void changeStatus(LoginStatus status) {
        user.setStatus(status);
        System.out.println("Status is changed");
        notifyAllObservers();
    }

    public void login(){
        if (!this.isValidIp()){
            user.setStatus(LoginStatus.INVALID);
        } else if (this.isValidEmail()){
            user.setStatus(LoginStatus.SUCCESS);
        } else {
            user.setStatus(LoginStatus.FAILURE);
        }
    }

    private boolean isValidEmail() {
        return "mr.duongtiendev@gmail.com".equalsIgnoreCase(user.getEmail());
    }

    private boolean isValidIp() {
        return "192.168.0.1".equals(user.getIp());
    }
}
