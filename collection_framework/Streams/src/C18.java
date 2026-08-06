import java.util.*;
import java.util.stream.Collectors;

public class C18 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya", "Ram"
    );

    List<String> result = names.stream()
            .filter(x -> x.length() > 3)
            .collect(Collectors.toList());

    System.out.println(result);
  }
}
