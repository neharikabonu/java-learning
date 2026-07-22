import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C2 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);

    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
      if (it.next() % 2 == 0) {
        it.remove();
      }
    }

    System.out.println(list);
  }
}
