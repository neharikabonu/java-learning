import java.util.ArrayList;
import java.util.List;

public class C7 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println(list.contains(10));
    System.out.println(list.contains(40));

  }
}
