package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public int getTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.println(", Price : " + item.price());
        }

    }
}
