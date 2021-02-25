package exercises.ex04.entities;

public abstract class TaxPayer {

    private String name;
    private Double annualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String _name, Double _annualIncome) {
        name = _name;
        annualIncome = _annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double _annualIncome) {
        annualIncome = _annualIncome;
    }

    public abstract Double tax();
}
