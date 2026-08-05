import java.util.function.Predicate;

public class C6 {
  public static void main(String[] args) {
    Predicate<Integer> ans = x -> x > 50;
    System.out.println(ans.test(70));
    System.out.println(ans.test(30));
  }
}
