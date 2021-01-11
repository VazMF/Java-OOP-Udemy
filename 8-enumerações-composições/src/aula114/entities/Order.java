package aula114.entities;

import aula114.entities.enums.OrderStatus;
import java.util.Date;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date _moment) {
        moment = _moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus _status) {
        status = _status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
