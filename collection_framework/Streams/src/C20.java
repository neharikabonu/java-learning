import java.util.*;

public class C20 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    boolean num = numbers.stream()
            .anyMatch(x -> x > 45);

    System.out.println(num);
  }
}
