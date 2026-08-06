import java.util.*;

public class C22 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    boolean result = numbers.stream()
            .noneMatch(x -> x < 0);

    System.out.println(result);
  }
}
