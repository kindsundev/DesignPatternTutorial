package creational.factory_method;

public class ClientTest {
    public static void main(String[] args) {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        System.out.println(hardCandy.getCandyName());

        Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY);
        System.out.println(mintyCandy.getCandyName());

    //        Candy other = CandyFactory.getCandy(null);
    //        System.out.println(other.getCandyName());

        /*O day chung ta dang da hinh,
        neu muon lay nhung method rieng biet cua class con
        thi chung ta khoi tao dung kieu cua no*/

    }
}
