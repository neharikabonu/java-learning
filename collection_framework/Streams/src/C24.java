import java.util.*;

public class C24 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    Optional<Integer> max = numbers.stream().max(Integer::compare);

    System.out.println(max);
  }
}
