import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    int n = sc.nextInt();

    int i = 0;
    while (i < n) {
      list.add(sc.nextInt());
      i++;
    }

    System.out.println(list);

    ListIterator<Integer> it = list.listIterator();

    while (it.hasNext()) {
      int num = it.next();
      if(num % 2 == 0) {
        it.set(0);
      }
    }

    System.out.println(list);
  }
}
