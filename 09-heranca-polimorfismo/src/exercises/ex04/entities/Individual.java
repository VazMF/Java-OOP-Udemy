package exercises.ex04.entities;

public class Individual extends TaxPayer {

    private Double healthSpending;

    public Individual() {
    }

    public Individual(String _name, Double _annualIncome, Double _healthSpending) {
        super(_name, _annualIncome);
        healthSpending = _healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double _healthSpending) {
        healthSpending = _healthSpending;
    }

    @Override
    public Double tax() {
        double tax = 0.0;
       if (getAnnualIncome() < 20000.00) {
           tax = getAnnualIncome() * 0.15 - (healthSpending * 0.5);
       } else {
           tax = getAnnualIncome() * 0.25 - (healthSpending * 0.5);
       }
       return tax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + ": $ " + String.format("%.2f", tax()));
        return sb.toString();
    }
}
