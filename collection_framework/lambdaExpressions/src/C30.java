import java.util.ArrayList;
import java.util.function.Supplier;

public class C30 {
  public static void main(String[] args) {

    Supplier<ArrayList<Integer>> s = ArrayList::new;

    ArrayList<Integer> list = s.get();

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list);
  }
}