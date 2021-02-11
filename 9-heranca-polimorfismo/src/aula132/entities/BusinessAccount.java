package aula132.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer _number, String _holder, Double _balance, Double _loanLimit) {
        super(_number, _holder, _balance);
        loanLimit = _loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double _loanLimit) {
        loanLimit = _loanLimit;
    }

    public void loan(double amount) {
       if (amount <= loanLimit) {
           balance += amount = 10.0;
       }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
