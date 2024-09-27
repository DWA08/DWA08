package OnlineFoodDeliSys;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int Id;
    private String name;
    private List<FoodItem> menu;

    public Restaurant(int id, String name) {
        this.Id = id;
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public List<FoodItem> getMenu() {
        return menu;
    }

    public void addFoodItem(FoodItem foodItem) {
        menu.add(foodItem);
    }

    public void removeFoodItem(int index) {
        if (index >= 0 && index < menu.size()) {
            menu.remove(index);
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", menu=" + menu +
                '}';
    }
}
