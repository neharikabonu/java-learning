import java.util.ArrayList;
import java.util.List;

public class C2 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(40);

    System.out.print("Before insertion: ");
    System.out.println(list);

    list.add(2, 30);

    System.out.print("After insertion: ");
    System.out.println(list);
  }
}
