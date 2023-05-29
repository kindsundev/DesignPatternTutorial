package behavioral.observer.ex2;


public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        var observer1 = new Observer() {
            @Override
            public void update(String message) {
                System.out.println("Message 1 changed: " + message);
            }
        };

        var observer2 = new Observer() {
            @Override
            public void update(String message) {
                System.out.println("Message 2 changed: " + message);
            }
        };

        subject.attach(observer1);
        subject.attach(observer2);

        subject.notifyDataChanged("Test change state 1");
        System.out.println("--------------------------------");
        subject.detach(observer1);
//
        subject.notifyDataChanged("Test change state 2");
        System.out.println("--------------------------------");
        subject.attach(observer1);
        subject.notifyDataChanged("Test change state 3");
    }
}
