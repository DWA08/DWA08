package OnlineFoodDeliSys;

import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        FoodService foodService = new FoodService();
        OrderService orderService = new OrderService();

        FoodItem pizza = new FoodItem(1, "Pizza", 8.99);
        FoodItem burger = new FoodItem(2, "Burger", 5.49);

        Restaurant restaurant = new Restaurant(1, "Fast Food Place");
        foodService.addRestaurant(restaurant);
        foodService.addFoodItemToRestaurant(1, pizza);
        foodService.addFoodItemToRestaurant(1, burger);

        Customer customer = new Customer(1, "John Doe", 1234567890);
        customerService.addCustomer(customer);

        customer.getCart().addItem(pizza, 2);
        customer.getCart().addItem(burger, 1);

        Order order = new Order(1, customer);
        orderService.placeOrder(order);
        customerService.placeOrder(customer, order);

        System.out.println(order);

        List<Restaurant> allRestaurants = foodService.getAllRestaurants();
        System.out.println("Available Restaurants: " + allRestaurants);

        List<Order> customerOrders = orderService.getOrdersByCustomer(customer.getUserId());
        System.out.println("Customer Orders: " + customerOrders);
    }
}
