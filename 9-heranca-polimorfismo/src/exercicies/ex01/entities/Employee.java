package exercicies.ex01.entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee() {
    }

    public Employee(String _name, Integer _hours, Double _valuePerHour) {
        name = _name;
        hours = _hours;
        valuePerHour = _valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(int _hours) {
        hours = _hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double _valuePerHour) {
        valuePerHour = _valuePerHour;
    }

    public double payment() {
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " - $ " + String.format("%.2f", payment()));
        return sb.toString();
    }
}
