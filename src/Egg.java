public class Egg extends Product {
    private double perPiecePrice;
    public Egg(String name,double perPiecePrice,String description) {
        super(name,description);
        this.perPiecePrice = perPiecePrice;

    }
    public double getPerPiecePrice() {
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
