package BankAccount;

import java.util.List;

public class Service {
    public List<User> users;

    public void showAccounts(List<User> users) {
        this.users = users;
        System.out.println("The are accounts");
        for (User user : users) {
            System.out.println(user.getUserName());
            List<Account<?>>[] accounts = user.getAccountList();
            for (List<Account<?>> account : accounts){
                System.out.println("\t" + account);
            }
        }
    }

    public Double printTax(User user, double price) {
        Double totalSum = 0.0;
        Double tax;
        for (List<Account<?>> account : user.getAccountList()) {
            totalSum = totalSum + account.getSum();
        }
        tax = totalSum*0.05;
        return tax;
    }
}
