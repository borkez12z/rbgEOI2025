package ejercicioInterfaz4;

public class TestAccount {
    public static void main(String[] args) {

        Bank bank = new Bank();

        SavingsAccount savingsAccount= new SavingsAccount(40,0.01);
        bank.addAccount(savingsAccount);
        CurrentAccount currentAccount= new CurrentAccount(40);
        bank.addAccount(currentAccount);

        System.out.println(savingsAccount.getBalance());
        System.out.println(savingsAccount.calcInterest());

    }
}
