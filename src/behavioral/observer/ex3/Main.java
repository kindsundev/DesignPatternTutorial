package behavioral.observer.ex3;

import behavioral.observer.ex3.notifier.Logger;
import behavioral.observer.ex3.notifier.Mailer;
import behavioral.observer.ex3.notifier.Protector;

public class Main {

    public static AccountService createAccount(String email, String ip){
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }

    public static void main(String[] args) {
        AccountService account1 = createAccount("mr.duongtien@gmail.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("-------------------------------");

        AccountService account2 = createAccount("mr.duongtiendev@gmail.com", "192.168.0.1");
        account2.login();
        account2.changeStatus(LoginStatus.SUCCESS);
    }
}
