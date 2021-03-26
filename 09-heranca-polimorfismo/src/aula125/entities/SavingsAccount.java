package aula125.entities;

public final class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){
    }

    public SavingsAccount(Integer _number, String _holder, Double _balance, Double _interestRate) {
        super(_number, _holder, _balance);
        interestRate = _interestRate;
    }

    public Double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(Double _interestRate){
        interestRate = _interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}
