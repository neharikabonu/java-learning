import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C16 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 25, 8, 40, 13, 50);
//    numbers.forEach(x -> System.out.print(x + " "));
//    Predicate<List> num = x -> (x % 2) == 0; this is wrong
    numbers.forEach(x -> {
      if (x % 2 == 0) {
        System.out.print(x + " ");
      }
    } );
  }
}
