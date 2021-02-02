package exercises.ex02.entities;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String _name, Double _price) {
        name = _name;
        price = _price;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double _price) {
        price = _price;
    }

    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", getPrice());
    }
}
