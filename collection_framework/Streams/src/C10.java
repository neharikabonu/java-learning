import java.util.*;

public class C10 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(40, 10, 30, 20, 50);

    numbers.stream()
            .sorted((a, b) -> (b - a))
            .forEach(System.out::println);
  }
}
