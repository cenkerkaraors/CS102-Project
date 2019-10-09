import java.util.ArrayList;

public class Farmer {
    private String name;
    private double balance;
    private ArrayList<Location> locations;
    private ArrayList<Product> products;
    private String passWord;
    public Farmer(String name) {
        this.name = name;
        locations = new ArrayList<Location>();
        products = new ArrayList<Product>(); // içindeki elemanları kullanırken typcast unutma
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public ArrayList<Location> getLocations() {
        return locations;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setName(String n) {
        name = n;
    }
    public void incBalance(double money){
        balance += money;
    }
    public void setBalance(double b) {
        balance = b;
    }
    public void addLocation(Location location) {
        locations.add(location);
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void setLocations(ArrayList<Location> locationArrayList){
        locations = locationArrayList;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    public String getPassWord(){
        return this.passWord;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}
