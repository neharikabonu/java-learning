import java.util.Arrays;
import java.util.List;

public class C1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

    numbers.stream()
            .forEach(System.out::println);
  }
}
