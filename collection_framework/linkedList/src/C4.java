import java.util.*;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    System.out.println(list);

    ListIterator<Integer> it = list.listIterator(list.size());

    while (it.hasPrevious()) {
      System.out.print(it.previous() + " ");
    }

//    Iterator<Integer> li = list.descendingIterator();
  }
}
