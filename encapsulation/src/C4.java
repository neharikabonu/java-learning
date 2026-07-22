import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount15 ba1 = new BankAccount15();
        int choice;
        do {
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                        ba1.deposit(amount);
                }
                case 2 -> {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    ba1.withdrawal(amount);
                }
                case 3 -> System.out.println("Balance: Rs "+ba1.getBalance());
                case 4 -> {
                    System.out.println("Thank You");
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        } while (true);

    }
}

class BankAccount15 {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}
