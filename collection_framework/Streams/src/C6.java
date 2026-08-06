import java.util.*;

public class C6 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

    numbers.stream()
            .map(x -> x * 2)
            .forEach(System.out::println);
  }
}
