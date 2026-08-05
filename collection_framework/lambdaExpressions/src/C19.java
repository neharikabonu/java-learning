import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C19 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(12, 5, 30, 7, 18, 25);

    Predicate<Integer> num = x -> x > 10 && x % 2 == 0;

    numbers.forEach(x -> {
      if (num.test(x)) {
        System.out.println(x);
      }
    });
  }
}
