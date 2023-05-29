package behavioral.observer.ex3;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObservers();
}
