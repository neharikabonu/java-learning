package OOPs.Classes_Objects;

public class C33 {
    public static void main(String[] args) {
        BankAccount[] acc = {
                new BankAccount(101, "Neharika", 58394),
                new BankAccount(102, "Neha", 44232),
                new BankAccount(103, "Neharika B", 32654)
        };

        for (BankAccount det : acc) {
            det.displayDetails();
        }
    }
}

class BankAccount {
    int accNo;
    String accName;
    int balance;

    BankAccount(int accNo, String accName, int balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    void displayDetails () {
        System.out.println("Account Number: "+accNo+"\nHolder Name: "+accName+"\nBalance: "+balance);
        System.out.println();
    }
}