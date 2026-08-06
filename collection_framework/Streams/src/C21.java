import java.util.*;

public class C21 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    boolean result = numbers.stream()
            .allMatch(x -> x > 5);
    System.out.println(result);
  }
}
