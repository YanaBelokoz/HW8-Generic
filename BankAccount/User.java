package BankAccount;

import java.util.List;

public class User {
    private String userName;
    private List<Account<?>> accountList;

    public User (String userName, List<Account<?>> accountList){
        this.userName = userName;
        this.accountList = accountList;
    }

    public static void printUsers(List<User> users) {
    }

    public List<Account<?>> getUserName() {
        return accountList;
    }

    public List<Account<?>>[] getAccountList(){
        return new List[]{accountList};
    }
}
