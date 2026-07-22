public class C3 {
    public static void main(String[] args) {
        System.out.println("Transaction Counter");
        BankAccount14 ba1 = new BankAccount14();
        ba1.deposit(1000);
        ba1.deposit(5670);
        ba1.deposit(6783);
        ba1.withdraw(583);
        ba1.withdraw(1000);
        ba1.displayTransactionCount();
        System.out.println();
    }
}

class BankAccount14 {
    private double balance;
    private int depositCount;
    private int withdrawalCount;

    public void deposit(double amount) {
        balance += amount;
        depositCount++;
    }

    public void withdraw(double amount) {
        balance -= amount;
        withdrawalCount++;
    }

    public void displayTransactionCount() {
        System.out.println("Deposit: "+depositCount+" times");
        System.out.println("Withdrawal: "+withdrawalCount+" times");
    }
}