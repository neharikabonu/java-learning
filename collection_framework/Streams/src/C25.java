import java.util.*;

public class C25 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    int sum = numbers.stream()
            .reduce(0, (a,b) -> (a+b));

    System.out.println(sum);
  }
}
