import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C3 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 25, 8, 40, 13, 50);

    numbers.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
  }
}
