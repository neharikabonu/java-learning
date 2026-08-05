import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C32 {
  public static void main(String[] args) {

    List<Integer> numbers = new ArrayList<>(
            Arrays.asList(40, 10, 30, 20, 50)
    );

    Collections.sort(numbers, (a, b) -> b - a);

    System.out.println(numbers);
  }
}