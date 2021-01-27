package aula125.entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer _number, String _holder, Double _balance) {
        number = _number;
        holder = _holder;
        balance = _balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer _number) {
        number = _number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String _holder) {
        holder = _holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
