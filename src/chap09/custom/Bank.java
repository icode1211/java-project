package chap09.custom;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(30000);
        account.deposit(40000);
        try {
            account.withdraw(100000);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
