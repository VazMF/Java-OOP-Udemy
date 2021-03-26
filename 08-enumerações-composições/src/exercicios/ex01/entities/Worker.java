package exercicios.ex01.entities;

import exercicios.ex01.entities.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //associações
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker() {
    }

    public Worker(String _name, WorkerLevel _level, Double _baseSalary, Department _department) {
        name = _name;
        level = _level;
        baseSalary = _baseSalary;
        department = _department;
    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel _level) {
        level = _level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double _baseSalary) {
        baseSalary = _baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract contract : contracts) {
            calendar.setTime(contract.getDate());
            int contract_year = calendar.get(Calendar.YEAR);
            int contract_month = calendar.get(Calendar.MONTH) + 1;
            if (year == contract_year && month == contract_month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

}
