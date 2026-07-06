public class C7 {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCard();
        p.pay();

        p = new NetBanking();
        p.pay();

        p = new UPI();
        p.pay();
    }
}

abstract class Payment {
    abstract void pay();
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Paid through Credit Card");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paid through UPI");
    }
}

class NetBanking extends Payment {
    @Override
    void pay() {
        System.out.println("Paid through Net Banking");
    }
}