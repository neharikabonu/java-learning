public class C4 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "neharika", 5000);
        System.out.println(b1.getAccNo());
        System.out.println(b1.getAccHolderName());
        System.out.println(b1.getBalance());

        BankAccount b2 = b1.deposit(2000);

        System.out.println(b2.getBalance());
    }
}

final class BankAccount {

    final private int accNo;
    final private String accHolderName;
    final private double balance;

    BankAccount(int accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    //getters
    public int getAccNo() {
        return accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount deposit(double amount) {
        return new BankAccount(accNo, accHolderName, balance + amount);
    }
}
