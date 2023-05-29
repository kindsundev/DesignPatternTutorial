package creational.singleton;

public class ClientTest {

    /*
    Vi du khi create music app thi tai 1 thoi diem chi co 1 bai hat duoc truy xuat de phat,
    hoac use room database trong android
    */

    public static void main(String[] args) {
        EagerInitialization eager = EagerInitialization.getInstance();
        eager.setName("DuongTien");
        System.out.println(eager.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName());
    }
}
