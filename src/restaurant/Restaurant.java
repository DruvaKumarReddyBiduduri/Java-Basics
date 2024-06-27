package restaurant;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurant {
    private Menu menu;
    private Map<String,Owner> owners;
    private Owner owner;

    public Restaurant() {
        this.menu = new Menu();
        this.owners=new HashMap<>();
        this.initializeMenu();
    }

    public void initializeOwners(){
        this.owners.put("Gojo",new Owner("Gojo","gojo",menu));
        this.owners.put("admin",new Owner("admin","admin",menu));
    }

    public void initializeMenu(){
        this.menu.addItem(new Item("Fried Rice",220));
        this.menu.addItem(new Item("Biryani",250));
        this.menu.addItem(new Item("Chilli Chicken",180));
    }

    public void  run(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 for Owner and 2 for Customer");
        int as=scanner.nextInt();
        boolean running=true;
        while (running){
            if (as==1){
                System.out.print("Enter name : ");
                String name=scanner.next();
                System.out.print("Enter password : ");
                String password=scanner.next();
                if(owners.containsKey(name)){
                    Owner owner=owners.get(name);
                    if(owner.getPassword().equals(password)){
                        this.owner=owner;
                        this.owner.isAuthenticated=true;
                    }else{
                        System.out.println("Password does not match");
                    }
                }
            }else{
                System.out.println("Select One of the Operations");
            }
        }
        this.menu.printMenu();
    }
}
