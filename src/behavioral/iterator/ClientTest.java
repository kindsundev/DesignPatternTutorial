package behavioral.iterator;

public class ClientTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add(new Item("Num 1", "/num1"));
        menu.add(new Item("Num 2", "/num2"));
        menu.add(new Item("Num 3", "/num3"));
        menu.add(new Item("Num 4", "/num4"));

        ItemIterator<Item> iterator = menu.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getTitle());
        }
    }
}
