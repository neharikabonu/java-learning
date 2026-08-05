import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class C24 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya", "Ram"
    );

    Function<String, String> f = x -> x.toUpperCase();

    names.forEach(x -> System.out.println(f.apply(x)));
  }
}
