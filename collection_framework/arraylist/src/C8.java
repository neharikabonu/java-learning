import java.util.ArrayList;
import java.util.List;

public class C8 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(10);

    System.out.println(list);

    System.out.println(list.indexOf(10));
    System.out.println(list.lastIndexOf(10));

    list.clear();

    System.out.println(list);
  }
}
