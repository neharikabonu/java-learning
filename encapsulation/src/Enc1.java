public class Enc1 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        System.out.println(ba1.getBalance());
        System.out.println();
        ba1.deposit(6000);
        System.out.println(ba1.getBalance());
        System.out.println();
        ba1.withdraw(560);
        System.out.println(ba1.getBalance());
        System.out.println();

        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Neharika");
        System.out.println("ID: "+s1.getId());
        System.out.println("Name: "+s1.getName());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited: "+amount);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Amount withdrawn: "+amount);
    }

    public double getBalance() {
        System.out.print("Current Balance: ");
        return balance;
    }
}

class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}