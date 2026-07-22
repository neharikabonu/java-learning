import java.util.*;

public class C3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    ListIterator<Integer> li = list.listIterator();

    System.out.println("Forward: ");

    while (li.hasNext()) {
      System.out.print(li.next() + " ");
    }

    System.out.println("Backward: ");

    while (li.hasPrevious()) {
      System.out.print(li.previous() + " ");
    }
  }
}
