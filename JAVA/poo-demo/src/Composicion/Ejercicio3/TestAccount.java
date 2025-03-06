package Composicion.Ejercicio3;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer= new Customer(2,"Manolo", 'h');
        Account account= new Account(1,customer,330);
        System.out.println(account);
        account.deposit(100);
        account.withdraw(300);
        System.out.println(account);

    }
}
