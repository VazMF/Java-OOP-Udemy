package exercicies.ex01.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String _name, Integer _hours, Double _valuePerHour, Double _additionalCharge) {
        super(_name, _hours, _valuePerHour);
        additionalCharge = _additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double _additionalCharge) {
        additionalCharge = _additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + ((110*additionalCharge) / 100);
    }
}
