package exercises.ex02.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
    }

    public UsedProduct(String _name, Double _price, Date _manufactureDate) {
        super(_name, _price);
        manufactureDate = _manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date _manufactureDate) {
        manufactureDate = _manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + dateFormat.format(getManufactureDate()) + ")";
    }
}
