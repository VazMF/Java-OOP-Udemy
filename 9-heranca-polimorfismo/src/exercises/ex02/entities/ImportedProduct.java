package exercises.ex02.entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String _name, Double _price, Double _customsFee) {
        super(_name, _price);
        customsFee = _customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double _customsFee) {
        customsFee = _customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", getCustomsFee()) + ")";
    }

    public double totalPrice() {
        return getPrice() + getCustomsFee();
    }
}
