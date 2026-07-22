import java.util.*;

public class C9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    System.out.println("Original: " + list);

    ListIterator<Integer> it = list.listIterator();

    while (it.hasNext()) {
      int num = it.next();
      if (num % 2 == 0) {
        it.add(100);
      }
    }

    System.out.println(list);
  }
}
