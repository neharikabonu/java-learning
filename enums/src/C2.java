public class C2 {
  public static void main(String[] args) {
    Days[] day = Days.values();

    for (Days d : day) {
      System.out.println(d.name());
//      System.out.println(d);
    }
  }
}

enum Days {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY
}