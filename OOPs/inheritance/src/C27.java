package OOPs.inheritance.src;

public class C27 {
    public static void main(String[] args) {

    }
}

class Account {
    int accNo;
    String accName;
    double balance;

    Account(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    double intRate;

    SavingsAccount(int accNo, String accName, double balance, double intRate) {
        super(accNo, accName, balance);
        this.balance = balance;
    }
}

class CurrentAccount extends Account {
    double draftLimit;

    CurrentAccount(int accNo, String accName, double balance, double draftLimit) {
        super(accNo, accName, balance);
        this.draftLimit = draftLimit;
    }
}