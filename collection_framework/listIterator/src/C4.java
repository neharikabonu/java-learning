import java.util.*;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    System.out.println(list);

    ListIterator<Integer> it = list.listIterator();

    while (it.hasNext()) {
      if (it.next() % 2 == 0) {
        it.add(100);
      }
    }

    System.out.println(list);
  }
}
