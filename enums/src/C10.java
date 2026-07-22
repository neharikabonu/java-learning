public class C10 {
  public static void main(String[] args) {
    for (VehicleType wheels : VehicleType.values()) {
      System.out.println(wheels);
    }
  }
}

enum VehicleType {
  CAR(4),
  BIKE(2),
  TRUCK(6);

  private final int wheels;

  VehicleType(int wheels1) {
    this.wheels = wheels1;
  }

  public int getWheels() {
    return wheels;
  }

  @Override
  public String toString() {
    return name() +" -> " + getWheels();
  }
}