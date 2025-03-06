package ejercicioInterfaz4;

public class SavingsAccount implements Account{

    double balance;
    double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount + " to Savings account.");
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn " + amount + " to Savings account.");

    }

    @Override
    public double calcInterest() {
        return balance * interestRate;

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
