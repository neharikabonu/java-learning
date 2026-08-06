import java.util.*;

public class C7 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya"
    );

    names.stream()
            .map(x -> x.toUpperCase())
            .forEach(System.out::println);
  }
}
