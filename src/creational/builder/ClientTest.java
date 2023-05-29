package creational.builder;

public class ClientTest {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .buildWalls(4)
                .buildDoor(2)
                .buildColor("Red")
                .build();

        System.out.println(house);
    }
}
