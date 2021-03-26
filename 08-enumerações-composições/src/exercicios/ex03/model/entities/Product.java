package exercicios.ex03.model.entities;

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

    public void setPrice(Double _price) {
        price = _price;
    }
}
