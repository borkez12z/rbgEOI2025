package ejercicioInterfaz4;

import java.util.ArrayList;
import java.util.List;

public class Bank{
    List<Account> accounts;

    public Bank(){
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account a){
        accounts.add(a);
    }

    public List<Account> getAccounts(){
        return accounts;
    }
}
