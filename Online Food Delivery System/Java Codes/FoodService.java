package OnlineFoodDeliSys;

import java.util.ArrayList;
import java.util.List;

public class FoodService {
    private List<Restaurant> restaurants;

    public FoodService() {
        restaurants = new ArrayList<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void removeRestaurant(int id) {
        restaurants.removeIf(restaurant -> restaurant.getId() == id);
    }

    public Restaurant getRestaurant(int id) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == id) {
                return restaurant;
            }
        }
        return null;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurants;
    }

    public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) {
        Restaurant restaurant = getRestaurant(restaurantId);
        if (restaurant != null) {
            restaurant.addFoodItem(foodItem);
        }
    }

    public void removeFoodItemFromRestaurant(int restaurantId, int index) {
        Restaurant restaurant = getRestaurant(restaurantId);
        if (restaurant != null) {
            restaurant.removeFoodItem(index);
        }
    }
}

