import java.util.Scanner;

public class PaymentGateway {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("CHOOSE PAYMENT CHOICE: ");
      System.out.println("1. Credit Card");
      System.out.println("2. UPI");
      System.out.println("3. Paypal");
      System.out.println("0. Exit");
      int choice = sc.nextInt();

      Payment payment = PaymentFactory.getPayment(choice);

      if (payment == null) {
        System.out.println("Exiting...");
        return;
      }
      payment.pay();
      }
  }

interface Payment {
  void pay();
}

class CreditCard implements Payment {
  @Override
  public void pay() {
    System.out.println("Payment via Credit Card");
  }
}

class UPIPayment implements Payment {
  @Override
  public void pay() {
    System.out.println("Payment via UPI");
  }
}

class PayPal implements Payment {
  @Override
  public void pay() {
    System.out.println("Payment via PayPal");
  }
}

class PaymentFactory {
  public static Payment getPayment(int choice) {
    switch (choice) {
      case 1 -> {
        return new CreditCard();
      }
      case 2 -> {
        return new UPIPayment();
      }
      case 3 -> {
        return new PayPal();
      }
      default -> {
        return null;
      }
    }
  }
}