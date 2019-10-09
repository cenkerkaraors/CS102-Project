public class Patato extends Product {
    private double perKgPrice;
    public Patato(String name,double perKgPrice,String description) {
        super(name,description);
        this.perKgPrice = perKgPrice;

    }
    public double getPerKgPrice() {
        return perKgPrice;
    }
    public void setPerKgPrice(double price){
        perKgPrice = price;
    }

    @Override
    public void setDescription(String d) {
        super.setDescription(d);
    }

}
