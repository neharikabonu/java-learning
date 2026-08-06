import java.util.Arrays;
import java.util.List;

public class C5 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            5, 10, 15, 20, 25, 30, 35, 40
    );

    numbers.stream()
            .filter(x -> (x % 2 == 0) && (x > 20))
            .forEach(System.out::println);
  }
}
