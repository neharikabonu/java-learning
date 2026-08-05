import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C25 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

    Predicate<Integer> p = x -> x > 20;

    numbers.forEach(x -> {
      if (p.test(x)) {
        System.out.println(x);
      }
    });
  }
}
