public class C17 {
  public static void main(String[] args) {
    Vehicle17 vehicle = new BMW();
    vehicle.start();
  }
}

interface Vehicle17 {
  default void start() {
    System.out.println("Vehicle17 is starting");
  }
}

interface Car17 extends Vehicle17 {

}

class BMW implements Car17 {
  @Override
  public void start() {
    System.out.println("BMW is starting");
  }
}