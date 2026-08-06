import java.util.*;

public class C13 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 20, 30, 40, 50, 60, 70
    );

    numbers.stream()
            .limit(3)
            .forEach(System.out::println);
  }
}
