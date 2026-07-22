import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);

    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
