import java.util.ArrayList;

public class FarmBank {
    private static double balance = 0.0;
    private final double tax = 0.02;
    private int countOfCustomers;
    private int countOfFarmers;
    private ArrayList<Customer> customers;
    private ArrayList<Farmer> farmers;
    private ArrayList<Location> tempFarmerLocationList;
    private ArrayList<Product> initialProductList;
    private Location tempLocation;
    private ArrayList<Product> tempProductsFarmerCombo;
    private ArrayList<Product> tempProductsFarmer;

    public FarmBank() {
        customers = new ArrayList<Customer>();
        farmers = new ArrayList<Farmer>();
        tempProductsFarmerCombo = new ArrayList<Product>();
        initialProductList = new ArrayList<Product>();
        tempProductsFarmer = new ArrayList<Product>();
        tempFarmerLocationList = new ArrayList<>();
        countOfCustomers = 0;
        countOfFarmers = 0;

    }
    public double getTax() {
        return tax;
    }
    public double getBalance() {
        return balance;
    }

    public void incBalance(double money) {
        balance += money;
    }
    public void decBalance(double money){
        balance -= money;
    }
    public int getCountOfCustomers() {
        return countOfCustomers;
    }
    public int getCountOfFarmers() {
        return countOfFarmers;
    }
    public void incCountOfCustomers() {
        countOfCustomers +=1;
    }
    public void incCountOfFarmers() {
        countOfFarmers +=1;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public ArrayList<Farmer> getFarmers() {
        return farmers;
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
        countOfCustomers ++;
    }
    public void addFarmer(Farmer farmer) {
        farmers.add(farmer);
        countOfFarmers ++;
    }
    public void addTempFarmerLocations(Location tempLocation){
        this.tempLocation = tempLocation;
        tempFarmerLocationList.add(this.tempLocation);
    }
    public ArrayList<Product> getTempProductsFarmerCombo(){
        return tempProductsFarmerCombo;
    }
    public void addTempProductCombo(Product product){
        tempProductsFarmerCombo.add(product);
    }
    public ArrayList<Location> getTempFarmerLocation(){
        return tempFarmerLocationList;
    }
    public void setInitialProductList(){
        Apple apple = new Apple("Apple",0.00,"");
        Artichoke artichoke = new Artichoke("Artichoke",0.00,"");
        Cheese cheese = new Cheese("Cheese",0.00,"");
        Egg  egg = new Egg("Egg",0.00,"");
        Meat meat = new Meat("Meat",0,"");
        Milk milk = new Milk("Milk",0,"");
        Oil oil = new Oil("Oil",0,"");
        Olive olive = new Olive("Olive",0,"");
        Patato patato = new Patato("Patato", 0,"");
        Tomato tomato = new Tomato("Tomato",0,"");
        initialProductList.add(apple);
        initialProductList.add(artichoke);
        initialProductList.add(cheese);
        initialProductList.add(egg);
        initialProductList.add(meat);
        initialProductList.add(milk);
        initialProductList.add(oil);
        initialProductList.add(olive);
        initialProductList.add(patato);
        initialProductList.add(tomato);
    }
    public ArrayList<Product> getInitialProductList(){
        return initialProductList;
    }
    public void addTempProductFarmer(Product product){
        tempProductsFarmer.add(product);
    }
    public ArrayList<Product> getTempProductFarmer(){
        return  tempProductsFarmer;
    }
}

