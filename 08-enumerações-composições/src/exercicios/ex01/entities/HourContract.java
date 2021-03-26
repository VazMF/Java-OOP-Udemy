package exercicios.ex01.entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Integer hour;

    public HourContract() {
    }

    public HourContract(Date _date, Double _valuePerHour, Integer _hour) {
        date = _date;
        valuePerHour = _valuePerHour;
        hour = _hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date _date) {
        date = _date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double _valuePerHour) {
        valuePerHour = _valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer _hour) {
        hour = _hour;
    }

    public Double totalValue() {
       return valuePerHour * hour;
    }
}
