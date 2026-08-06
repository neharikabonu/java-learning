import java.util.*;

public class C12 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 20, 20, 30, 40, 40, 50, 10
    );

    numbers.stream()
            .distinct()
            .forEach(System.out::println);
  }
}
