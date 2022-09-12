package BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main8 {

    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        Account<String> account1 = new DebitAccount("1", 100.00);
        Account<String> account2 = new DebitAccount("2", 120.00);
        Account<String> account6 = new DebitAccount("4", 127.00);
        Account<String> account9 = new DebitAccount("5", 131.50);
        Account<Integer> account14 = new CreditAccount(6, 135.00);
        Account<Integer> account17 = new CreditAccount(9, 138.99);
        Account<Integer> account22 = new CreditAccount(11, 143.00);

        List<Account<?>> accountList1 = new ArrayList<>();
        accountList1.add(account1);
        accountList1.add(account2);
        accountList1.add(account6);
        accountList1.add(account9);
        accountList1.add(account14);
        accountList1.add(account17);
        accountList1.add(account22);
        User user1 = new User("Alex Greenwood", accountList1);

        Account<String> account3 = new DebitAccount("3", 111.00);
        Account<String> account4 = new DebitAccount("7", 147.00);
        Account<String> account7 = new DebitAccount("10", 133.00);
        Account<String> account10 = new DebitAccount("12", 136.75);
        Account<Integer> account12 = new CreditAccount(15, 139.73);
        Account<Integer> account18 = new CreditAccount(18, 142.88);
        Account<Integer> account25 = new CreditAccount(23, 154.11);

        List<Account<?>> accountList2 = new ArrayList<>();
        accountList1.add(account3);
        accountList1.add(account4);
        accountList1.add(account7);
        accountList1.add(account10);
        accountList1.add(account12);
        accountList1.add(account18);
        accountList1.add(account25);
        User user2 = new User("Mary Fisher", accountList2);

        Account<String> account5 = new DebitAccount("8", 168.01);
        Account<String> account8 = new DebitAccount("13", 168.03);
        Account<String> account11 = new DebitAccount("16", 170.00);
        Account<String> account13 = new DebitAccount("17", 188.73);
        Account<Integer> account15 = new CreditAccount(19, 199.79);
        Account<Integer> account19 = new CreditAccount(22, 202.55);
        Account<Integer> account29 = new CreditAccount(27, 220.33);

        List<Account<?>> accountList3 = new ArrayList<>();
        accountList1.add(account5);
        accountList1.add(account8);
        accountList1.add(account11);
        accountList1.add(account13);
        accountList1.add(account15);
        accountList1.add(account19);
        accountList1.add(account29);
        User user3 = new User("Anastasia River", accountList3);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        User.printUsers(users);
        Account.printAccounts(users);

    }
}
