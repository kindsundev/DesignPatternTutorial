package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Item> menus = new ArrayList<>();

    public void add(Item item) {
        menus.add(item);
    }

    public ItemIterator<Item> iterator() {
        return new MenuIterator();
    }

    class MenuIterator implements ItemIterator<Item> {
        private Integer currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < menus.size();
        }

        @Override
        public Item next() {
            return menus.get(currentPosition++);
        }
    }

}
