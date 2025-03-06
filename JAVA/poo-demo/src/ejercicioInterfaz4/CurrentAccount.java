package ejercicioInterfaz4;

public class CurrentAccount implements Account {

    double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to the current account.");
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from the current account.");
    }

    @Override
    public double calcInterest() {
        return 0;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
