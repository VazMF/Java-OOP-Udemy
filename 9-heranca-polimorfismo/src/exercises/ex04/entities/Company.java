package exercises.ex04.entities;

public class Company extends TaxPayer {

    private Integer employees;

    public Company() {
    }

    public Company(String _name, Double _annualIncome, Integer _employees) {
        super(_name, _annualIncome);
        employees = _employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(int _employees) {
        employees = _employees;
    }

    @Override
    public Double tax() {
        double tax = 0.0;
        if (employees > 10) {
            tax = getAnnualIncome() * 0.14;
        } else {
            tax = getAnnualIncome() * 0.16;
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
