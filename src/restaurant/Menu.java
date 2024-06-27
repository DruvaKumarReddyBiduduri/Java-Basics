package restaurant;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<String,Item> items;

    public Menu() {
        this.items = new HashMap<>();
    }

    public void addItem(Item item){
        this.items.put(item.getName(),item);
    }

    public void removeItem(Item item){
        this.items.remove(item.getName());
    }

    public Item getItem(String name){
        return this.items.get(name);
    }

    public void updateItemPrice(String name,double price){
        Item item=getItem(name);
        item.setPrice(price);
    }

    public void printMenu(){
        System.out.printf("%-20s %s\n","Item","Price");
        for (Item item:items.values()) {
            System.out.printf("%-20s %f\n",item.getName(),item.getPrice());
        }
    }
}
