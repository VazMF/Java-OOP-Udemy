package exercicios.ex03.model.entities;

import exercicios.ex03.model.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


    public Order() {
    }

    public Order(Date _moment, OrderStatus _status, Client _client) {
        moment = _moment;
        status = _status;
        client = _client;
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

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem orderItem : orderItems) {
            sum += orderItem.subTotal();
        }
        return sum;
    }

    public void showItems() {
        String out = "";
        OrderItem aux;
        for (int i = 0; i < orderItems.size(); i++) {
            aux = orderItems.get(i);
            out = out + aux.getPrice();

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf2.format(getMoment()) + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("ORDER ITEMS: " + "\n");
        for (OrderItem item: orderItems) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));
        return sb.toString();
    }
}
