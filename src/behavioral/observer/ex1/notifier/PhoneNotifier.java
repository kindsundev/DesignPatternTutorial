package behavioral.observer.ex1.notifier;

import behavioral.observer.ex1.Observer;
import behavioral.observer.ex1.Subject;
import behavioral.observer.ex1.VideoData;

import java.util.Objects;

public class PhoneNotifier extends Observer {

    public PhoneNotifier(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public void notify(Subject subject, Objects arg) {
        if (subject instanceof VideoData videoData){
            System.out.println(
                    String.format("Notify all subscribers via Phone with new Data" +
                                    "\n\tName: %s" +
                                    "\n\tDescription: %s" +
                                    "\n\tFileName: %s",
                            videoData.getTitle(),
                            videoData.getDescription(),
                            videoData.getFileName())
            );
        }
    }
}
