package creational.prototype;

public class ClientTest {
    public static void main(String[] args) {
        User user1 = new User("Duong Duong", "mr.duongdinh@gmail.com", 22);
        System.out.println(user1.getAge());

//        User user2 = user1;
        User user2 = user1.clone();
        user1.setAge(30);


        System.out.println(user2.getAge());

    }
}
