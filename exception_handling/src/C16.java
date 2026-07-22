public class C16 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.setBalance(15000);
        System.out.println("Balance: " + ba1.getBalance());

        try {
            ba1.withdraw(5000);
            ba1.withdraw(15000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance: " + ba1.getBalance());

    }
}

class BankAccount {
    private double balance;


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Withdrawn amount: "+amount);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}