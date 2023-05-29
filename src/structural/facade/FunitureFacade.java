package structural.facade;

public class FunitureFacade {
    private static FunitureFacade instance;
    private Funiture table;
    private Funiture chair;
    private Funiture tv;

    public FunitureFacade() {
        table = new Table();
        chair = new Chair();
        tv = new Television();
    }

    public static FunitureFacade getInstance() {
        if (instance == null) {
            instance = new FunitureFacade();
        }
        return instance;
    }

    public void makeTableAndChair() {
        table.make();
        chair.make();
    }

    public void makeTVAndChair() {
        tv.make();
        chair.make();
    }
}
