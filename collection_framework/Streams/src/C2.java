import java.util.Arrays;
import java.util.List;

public class C2 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya"
    );

    names.stream()
            .forEach(System.out::println);
  }
}
