public class C6 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 10000, 5);
        sa.displayAccount();
        System.out.println();
        sa.deposit(20000);
        sa.withdraw(1500);
        sa.addInterest();
        sa.displayAccount();
    }
}

class Account6 {
    int accountNumber;
    double balance;

    Account6(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Negative amount cannot be deposited");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends Account6 {
    private double interestRate;

    SavingsAccount(int accountNumber, double balance, int interestRate) {
        super(accountNumber, balance);
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Invalid Interest Rate");
        }
    }

    public double calculateInterest() {
        return (balance * interestRate)/100;
    }

    public double addInterest() {
        return balance + calculateInterest();
    }

    @Override
    public void displayAccount() {
        super.displayAccount();
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Interest: "+calculateInterest());
    }
}