package OOPs.abstraction.src;

public class C6 {
    public static void main(String[] args) {

    }
}

interface Payment {
    void pay();
    void refund();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Amount Paid through Credit Card");
    }

    public void refund() {
        System.out.println("Amount refunded successfully");
    }
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Amount Paid through UPI");
    }

    public void refund() {
        System.out.println("Amount refunded successfully");
    }
}

class NetBankingPayment implements Payment {
    public void pay() {
        System.out.println("Amount Paid through Net Banking");
    }

    public void refund() {
        System.out.println("Amount refunded successfully");
    }
}