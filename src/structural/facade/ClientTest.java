package structural.facade;

public class ClientTest {
    public static void main(String[] args) {
        FunitureFacade fun = FunitureFacade.getInstance();
        fun.makeTableAndChair();
        fun.makeTVAndChair();

    }
}
