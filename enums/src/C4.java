public class C4 {
  public static void main(String[] args) {

    for (TrafficLight4 light : TrafficLight4.values()) {
      System.out.println(light +" : " +light.ordinal());
    }
  }
}

enum TrafficLight4 { //compiler issues from IDE "duplicate class"
  RED,
  YELLOW,
  GREEN
}