public class C5 {
  public static void main(String[] args) {
    CheckNumber obj = x -> x % 2 == 0;

    System.out.println(obj.check(5));
    System.out.println(obj.check(10));
  }
}

@FunctionalInterface
interface CheckNumber {
  boolean check(int n);
}