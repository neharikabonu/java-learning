import java.util.*;

public class C16 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(
            10, 25, 8, 40, 13, 50
    );

    long num = numbers.stream()
            .filter(x -> x > 20)
            .count();
    System.out.println(num);
  }
}
