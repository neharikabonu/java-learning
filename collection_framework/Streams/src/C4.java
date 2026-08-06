import java.util.Arrays;
import java.util.List;

public class C4 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya", "Ram"
    );

    names.stream()
            .filter(x -> x.length() > 4)
            .forEach(System.out::println);
  }
}
