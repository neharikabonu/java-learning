import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class C22 {
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Ravi", "Anjali", "Raj", "Priya", "Ram"
    );

    Consumer<String> c = x -> System.out.println(x.length());

    names.forEach(x -> c.accept(x));
  }
}
