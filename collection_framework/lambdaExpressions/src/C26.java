import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C26 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(
            Arrays.asList(10, 15, 20, 25, 30, 35)
    );

    System.out.println(numbers);

    Predicate<Integer> p = x -> x % 2 != 0;

    numbers.removeIf(p);

//    numbers.removeIf(x -> x % 2 != 0);

    System.out.println(numbers);
  }
}
