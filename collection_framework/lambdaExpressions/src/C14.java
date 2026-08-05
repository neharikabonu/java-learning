import java.util.function.Predicate;

public class C14 {
  public static void main(String[] args) {
    Predicate<Integer> p = x -> x % 5 == 0;
    System.out.println(p.test(25));
    System.out.println(p.test(17));
  }
}
