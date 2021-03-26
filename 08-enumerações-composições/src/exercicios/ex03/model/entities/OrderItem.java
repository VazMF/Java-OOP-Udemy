package exercicios.ex03.model.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer _quantity, Double _price, Product _product) {
        quantity = _quantity;
        price = _price;
        product = _product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer _quantity) {
        quantity = _quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double _price) {
        price = _price;
    }

    public Double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName()
                + ", $" + String.format("%.2f", product.getPrice())
                + ", Quantity: " + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal()));
        return sb.toString();
    }
}
