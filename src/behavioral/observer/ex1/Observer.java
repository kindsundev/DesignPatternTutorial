package behavioral.observer.ex1;

import java.util.Objects;

public abstract class Observer {
    protected Subject subject;
    public abstract void notify(Subject subject, Objects arg);

}
