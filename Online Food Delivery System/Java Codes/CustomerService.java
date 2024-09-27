package OnlineFoodDeliSys;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(int userId) {
        customers.removeIf(customer -> customer.getUserId() == userId);
    }

    public Customer getCustomer(int userId) {
        for (Customer customer : customers) {
            if (customer.getUserId() == userId) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public void placeOrder(Customer customer, Order order) {
        customer.getCart().getItems().forEach(order::addItem);
        customer.getCart().getItems().clear();
    }
}
