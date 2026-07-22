public class C19 {
    public static void main(String[] args) {
        ATM a1 = new ATM();
        //deposit
        try {
            a1.deposit(1000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }

        //withdraw
        try {
            a1.withdraw(1500);
        } catch (NegativeAmountException | InsufficientBalanceException1 e) {
            System.out.println(e.getMessage());
        }

    }
}

class ATM {
    private double balance;

    public void deposit(double amount) throws NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException("Negative amount or 0 cannot be deposited");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException1,
                                               NegativeAmountException {
        if(amount <= 0) {
            throw new NegativeAmountException("Negative amount cannot be withdrawn");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException1("Insufficient Balance");
        }

        balance -= amount;
    }
}

class NegativeAmountException extends Exception {
    NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException1 extends Exception {
    InsufficientBalanceException1(String message) {
        super(message);
    }
}