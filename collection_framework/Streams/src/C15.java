import java.util.*;

public class C15 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 20, 30, 40, 50, 60, 70, 80
    );

    numbers.stream()
            .skip(3)
            .limit(3)
            .forEach(System.out::println);
  }
}
