package behavioral.observer.ex1;

import behavioral.observer.ex1.notifier.EmailNotifier;
import behavioral.observer.ex1.notifier.FacebookNotifier;
import behavioral.observer.ex1.notifier.PhoneNotifier;
import behavioral.observer.ex1.notifier.YoutubeNotifier;

public class Main {
    public static void main(String[] args) {
        var videoData = new VideoData();

        var email = new EmailNotifier(videoData);
        var phone = new PhoneNotifier(videoData);
        var youtube = new YoutubeNotifier(videoData);

        videoData.setTitle("Observer design pattern");

        // change runtime
        videoData.detachObserver(youtube);
        System.out.println("---------------------------");
        videoData.setDescription("Duong Tien Dev");

        var facebook = new FacebookNotifier(videoData);
        System.out.println("---------------------------");
        videoData.setFileName("Never give up");

    }
}
