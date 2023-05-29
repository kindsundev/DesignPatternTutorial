package behavioral.observer.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    public void attachObserver(Observer observer){
        observerList.add(observer);
    }

    public void detachObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(Subject subject, Objects arg){
        observerList.forEach((observer) -> observer.notify(subject, arg));
    }
}
