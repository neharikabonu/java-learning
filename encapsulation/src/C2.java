public class C2 {
    public static void main(String[] args) {
        System.out.println("Bank Account Details");
        BankAccount11 ba1 = new BankAccount11();
        System.out.println("Balance: "+ba1.getBalance());
        ba1.deposit(5000);
        System.out.println("Balance: "+ba1.getBalance());
        ba1.deposit(6500);
        System.out.println("Balance: "+ba1.getBalance());
        System.out.println();
        ba1.withdraw(11000);
        System.out.println("Balance: "+ba1.getBalance());
    }
}

class BankAccount11 {
    private int accNo;
    private double balance;
    int minBal = 1000;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance!");
        } else if (balance - amount < minBal) {
            System.out.println("Minimum Balance should be maintained");
        }
    }
}