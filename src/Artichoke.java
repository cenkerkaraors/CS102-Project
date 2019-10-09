public class Artichoke extends Product {
    private double perPiecePrice;
    public Artichoke(String name,double perKgPrice,String description) {
        super(name,description);
        this.perPiecePrice = perKgPrice;

    }
    public double getPerKgPrice() {
        return perPiecePrice;
    }

    public void setPerKgPrice(double price){
        perPiecePrice = price;
    }

    @Override
    public void setDescription(String d) {
        super.setDescription(d);
    }
}
