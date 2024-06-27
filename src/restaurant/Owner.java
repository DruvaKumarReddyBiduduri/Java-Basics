package restaurant;

public class Owner {
    String name;
    String password;
    Menu menu;
    boolean isAuthenticated=false;

    public Owner(String name, String password,Menu menu) {
        this.name = name;
        this.password = password;
        this.menu=menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void operate(){

    }
}
