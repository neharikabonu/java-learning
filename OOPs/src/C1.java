import java.util.ArrayList;
import java.util.List;

public class C1 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        System.out.println("balance: "+ba1.checkBalance());
        ba1.deposit(100);
        System.out.println("balance: "+ba1.checkBalance());
        ba1.deposit(-100);
        System.out.println("balance: "+ba1.checkBalance());
        ba1.withdraw(1000);
        System.out.println("balance: "+ba1.checkBalance());
        ba1.withdraw(100);
        System.out.println("balance: "+ba1.checkBalance());    }

  public static class C2 {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();

      list.add(10);
      list.add(20);
      list.add(40);

  //    System.out.println("Before insertion: ");
      System.out.println(list);

      list.add(2, 30);

  //    System.out.println("After insertion");
      System.out.println(list);
    }
  }
}

class BankAccount {
    private int accNumber;
    private String accHolder;
    private double balance;

    public void deposit(double amount) {
        if (amount>=0) {
            balance += amount;
        } else {
            System.out.println("Negative amount cannot be deposited");
        }
    }

    public void withdraw(double amount) {
        if (balance>=amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double checkBalance() {
        return balance;
    }
}