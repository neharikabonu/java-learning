import java.util.*;
import java.util.stream.Collectors;

public class C17 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    List<Integer> list = numbers.stream()
            .filter(x -> x % 2 == 0)
            .collect(Collectors.toList());

    System.out.println(list);
  }
}
