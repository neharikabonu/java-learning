public class C6 {
  public static void main(String[] args) {
    PaymentStatus statusPending = PaymentStatus.PENDING;
    PaymentStatus statusSuccess = PaymentStatus.SUCCESS;
    PaymentStatus statusFailed = PaymentStatus.FAILED;

    checkStatus(statusPending);
    checkStatus(statusSuccess);
    checkStatus(statusFailed);
  }

  public static void checkStatus(PaymentStatus status) {
    switch (status) {
      case PENDING -> System.out.println("Payment Pending");
      case SUCCESS -> System.out.println("Payment Successful");
      case FAILED -> System.out.println("Payment Failed");
    }
  }
}

enum PaymentStatus {
  PENDING,
  SUCCESS,
  FAILED
}