public class C3 {
  public static void main(String[] args) {
    TrafficLight green = TrafficLight.GREEN;
    System.out.println(green.name());
  }
}

enum TrafficLight {
  RED,
  YELLOW,
  GREEN

}