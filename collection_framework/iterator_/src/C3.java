import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C3 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);

    int evenCount = 0;

    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
      int num = it.next();

      if(num % 2 == 0) {
        evenCount++;
      }
    }

    System.out.println("Even Count : " +evenCount);
  }
}
