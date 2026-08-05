import java.util.ArrayList;
import java.util.function.Supplier;

public class C31 {
  public static void main(String[] args) {
    Supplier<ArrayList<String>> s = ArrayList::new;

    ArrayList<String> list = s.get();

    list.add("Java");
    list.add("Lambda");
    list.add("Method Reference");

    System.out.println(list);
  }
}
