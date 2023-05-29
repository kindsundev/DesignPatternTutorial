package creational.singleton;

public class DoubleCheckLogin {
    private static DoubleCheckLogin instance;

    public static DoubleCheckLogin getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLogin.class) {
                if (instance == null) {
                    instance = new DoubleCheckLogin();
                }
            }
        }
        return instance;
    }

    /*
    * Neu ca 2 thread cung truy xuat thi se xay ra truog hop null, nen ta se check 2 lan
    * */


}
