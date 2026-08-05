import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class C21 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 25, 8, 40, 13, 50);

    Function<Integer, Integer> n = x -> x * 2;

    numbers.forEach(x -> System.out.println(n.apply(x)));
  }
}
