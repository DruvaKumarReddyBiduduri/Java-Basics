package restaurant;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private Map<String,Order> orders;

    public Customer() {
        this.orders = new HashMap<>();
    }

    public void addOrder(Item item,int quantity){
        this.orders.putIfAbsent(item.getName(),new Order(item,quantity));
    }

    public void updateQuantity(String name,int quantity){
        if(quantity>1){
            Order order=orders.get(name);
            order.quantity=quantity;
            return;
        }
        System.out.println("Invalid quantity "+quantity);
    }

    public void removeOrder(Item item){
        this.orders.remove(item.getName());
    }

    public void displayOrders(){

    }
}
