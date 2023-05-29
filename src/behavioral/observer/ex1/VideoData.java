package behavioral.observer.ex1;

public class VideoData extends Subject{

    private String title;
    private String description;
    private String fileName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        videoDataChange();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        videoDataChange();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        videoDataChange();
    }

    private void videoDataChange() {
        notifyObservers(this, null);
    }

}
