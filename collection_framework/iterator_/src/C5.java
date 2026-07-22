import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C5 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(25);
    list.add(10);
    list.add(80);
    list.add(40);
    list.add(60);

    int max = list.get(0);

    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
      int num = it.next();
      if(num > max) {
        max = num;
      }
    }

    System.out.println(max);
  }
}
