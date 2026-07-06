package OOPs.inheritance.src;

public class C4 {
    public static void main(String[] args) {
        SavingsAccount5 s1 = new SavingsAccount5(102231, 5300, 5.6);
        s1.display();
    }
}

class Account5 {
    int accNo;
    double balance;

    Account5(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class SavingsAccount5 extends Account5 {
    double interestRate;

    SavingsAccount5(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    double calcInterest() {
        return balance * interestRate / 100;
    }

    void display() {
        System.out.println("Account Number: "+accNo+"\nBalance: "+balance+"\nInterest Rate: "+interestRate+"\nInterest earned: Rs "+calcInterest());
    }
}

