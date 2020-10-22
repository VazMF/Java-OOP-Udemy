package aula66.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(double price, double quantity) {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
}
