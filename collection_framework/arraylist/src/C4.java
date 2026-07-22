import java.util.ArrayList;
import java.util.List;

public class C4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    System.out.println(list);

    list.remove(Integer.valueOf(20));

    System.out.println(list);
  }
}
