package OOPs.abstraction.src;

public class C4 {
    public static void main(String[] args) {

    }
}

abstract class BankAccount {
    int accNo;
    double balance;

    abstract void deposit(int amount);

    abstract void withdraw(int amount);

    BankAccount(int accNo){
        this.accNo = accNo;
    }

    abstract double displayBalance();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo) {
        super(accNo);
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance>=amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    double displayBalance() {
        return balance;
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accNo) {
        super(accNo);
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance>=amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    double displayBalance() {
        return balance;
    }
}