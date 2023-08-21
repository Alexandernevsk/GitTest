public class Shop {
    private double price;
    private String name;
    private String description;

    public Shop(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
