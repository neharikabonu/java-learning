import java.util.*;

public class C11 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya", "Sneha"
    );

    names.stream()
            .sorted()
            .forEach(System.out::println);
  }
}
