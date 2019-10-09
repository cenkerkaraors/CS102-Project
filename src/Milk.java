public class Milk extends Product {
    private double perLiterPrice;
    public Milk(String name,double perLiterPrice,String description) {
        super(name,description);
        this.perLiterPrice = perLiterPrice;

    }
    public double getPerLiterPrice() {
        return perLiterPrice;
    }
    public void setPerKgPrice(double price){
        perLiterPrice = price;
    }

    @Override
    public void setDescription(String d) {
        super.setDescription(d);
    }
}
