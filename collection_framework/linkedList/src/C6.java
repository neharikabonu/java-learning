import java.util.*;

public class C6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    ListIterator<Integer> it = list.listIterator();

    int evenCount = 0;

    while (it.hasNext()) {
      int num = it.next();
      if (num % 2 == 0) {
        evenCount++;
      }
    }

    System.out.println(evenCount);
  }
}
