import java.util.*;

public class C12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list1 = new LinkedList<>();


    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list1.add(sc.nextInt());
    }

    System.out.println(list1);

    ListIterator<Integer> it1 = list1.listIterator();

    List<Integer> list2 = new LinkedList<>();

    while (it1.hasNext()) {
      list2.addFirst(it1.next());
    }

    System.out.println(list2);
  }
}
