import java.util.*;

public class C23 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    Optional<Integer> min = numbers.stream()
            .min(Integer::compare);

    System.out.println(min);
  }
}
