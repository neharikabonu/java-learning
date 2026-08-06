import java.util.*;

public class C19 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    Optional<Integer> num = numbers.stream()
            .filter(x -> x > 20)
            .findFirst();

    System.out.println(num);
  }
}
