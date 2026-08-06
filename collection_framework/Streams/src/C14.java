import java.util.*;

public class C14 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 20, 30, 40, 50, 60, 70
    );

    numbers.stream()
            .skip(3)
            .forEach(System.out::println);
  }
}
