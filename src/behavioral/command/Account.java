package behavioral.command;

public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Account [" + name + "] opened\n");
    }

    public void close() {
        System.out.println("Account [" + name + "] closed\n");
    }
}
