import java.util.function.Predicate;

public class C10 {
  public static void main(String[] args) {
    Predicate<Integer> p = x -> x >= 0;
    System.out.println(p.test(10));
    System.out.println(p.test(-5));
  }
}
