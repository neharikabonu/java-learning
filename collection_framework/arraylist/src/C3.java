import java.util.ArrayList;
import java.util.List;

public class C3 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(20);
    list.add(30);

    System.out.println(list);

    list.remove(2);

    System.out.println(list);
  }
}
