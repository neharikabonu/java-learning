import java.util.*;

public class C9 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(40, 10, 30, 20, 50);

    numbers.stream()
            .sorted()
            .forEach(System.out::println);
  }
}
