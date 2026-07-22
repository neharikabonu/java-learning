public class C5 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.Account account = bank.new Account();
        account.displayBalance();
    }
}

class Bank {
    private double balance = 5000;

    class Account {
        void displayBalance() {
            System.out.println("Balance: " +balance);
        }
    }
}