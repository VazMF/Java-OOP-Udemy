package exercicios.ex01.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer _id, String _name, Double _salary) {
        id = _id;
        name = _name;
        salary = _salary;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer _id) {
        id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        salary += (salary * percentage/100);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("$%.2f", salary);
    }
}
