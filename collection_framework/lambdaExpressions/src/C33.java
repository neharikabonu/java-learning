import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C33 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(
            Arrays.asList("Ravi", "Anjali", "Raj", "Priya", "Sneha")
    );

    Collections.sort(names, (a, b) -> a.length() - b.length());
    System.out.println(names);
  }
}
