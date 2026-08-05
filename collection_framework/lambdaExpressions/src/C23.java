import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class C23 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    Function<Integer, Integer> f = x -> x * x;

    numbers.forEach(x -> System.out.println(f.apply(x)));
  }
}
