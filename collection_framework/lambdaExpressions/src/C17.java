import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C17 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 25, 8, 40, 13, 50);
    Predicate<Integer> num = x -> x > 20;
    numbers.forEach(x -> {
      if (num.test(x)) {
        System.out.print(x + " ");
      }
    });
  }
}
