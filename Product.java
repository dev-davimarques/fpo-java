public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor's
    public Product(){}
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter's and Setter's
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    // toString
    public String toString(){
        return String.format("Name: %s | Price: %.2f | Quantity: %d | totalValueInStock: %.2f%n", name, price, quantity, totalValueInStock());
    }

    // Methods
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addBalance(int quantity){
        this.quantity += quantity;
    }
    public void removeBalance(int quantity){
        if(this.quantity < quantity){
            this.quantity = 0;
        } else {
            this.quantity -= quantity;
        }
    }


}
