public class Product {
    private String name;
    private String description;
    //public Product() {
    //
    //    }
    public Product(String name,String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setName(String n) {
        name = n;
    }
    public void setDescription(String d) {
        description = d;
    }
}
