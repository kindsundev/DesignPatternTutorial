package structural.bridge;

public class ClientTest {
    public static void main(String[] args) {
        VietcomBank vcb = new VietcomBank(new CheckingAccount());
        TPBank tpb = new TPBank(new CheckingAccount());
        vcb.openAccount();
        tpb.openAccount();
    }
}
