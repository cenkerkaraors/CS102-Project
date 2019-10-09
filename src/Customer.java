public class Customer {
    private String name;
    private Location location;
    private double balance;
    private String password;
    private FarmBank farmbank;
    public Customer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Location getLocation() {
        return location;
    }
    public double getBalance() {
        return balance;
    }
    public String getPassword() {
        return password;
    }
    public void setBalance(double b) {
        balance = b;
    }
    public void incBalance(double money) {
        balance += money;
    }
    public void decBalance(double money) {
        balance -= money;
    }
    public void setLocation(String locationName,int locationZip) {
        location = new Location(locationName,locationZip);
    }
    public void setPassword(String p) {
        password = p;
    }
}
