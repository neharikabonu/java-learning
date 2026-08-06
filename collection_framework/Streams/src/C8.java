import java.util.*;

public class C8 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

    numbers.stream()
            .filter(x -> x > 10)
            .map(x -> x * 3)
            .forEach(System.out::println);
  }
}

