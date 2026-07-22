import java.util.ArrayList;
import java.util.List;

public class C6 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(20);
    list.add(10);
    list.add(10);

    int size = 0;

    for (Integer integer : list) {
      size++;
    }

    System.out.println(size);
  }
}
