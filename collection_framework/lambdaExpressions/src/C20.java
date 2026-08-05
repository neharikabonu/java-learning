import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C20 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya", "Ram", "Sneha"
    );

    Predicate<String> s = x -> x.length()> 4 && (x.startsWith("A") || x.startsWith("S"));

    names.forEach(x -> {
      if(s.test(x)) {
        System.out.println(x);
      }
    });
  }
}
