public class Product {

    private String name;
    private int price;

    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}