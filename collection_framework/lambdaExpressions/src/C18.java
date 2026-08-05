import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class C18 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya", "Ram", "Sneha"
    );

    Predicate<String> name = x -> x.length() > 4;

    names.forEach(x -> {
      if(name.test(x)) {
        System.out.println(x);
      }
    });
  }
}
