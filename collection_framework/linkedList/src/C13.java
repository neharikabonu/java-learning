import java.util.*;

public class C13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list1 = new LinkedList<>();

    System.out.println("List 1 size: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list1.add(sc.nextInt());
    }

    List<Integer> list2 = new LinkedList<>();

    System.out.println("List 2 size: ");
    int n1 = sc.nextInt();

    for (int i = 0; i < n1; i++) {
      list2.add(sc.nextInt());
    }

    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);

    list1.addAll(list2);

    System.out.println("Merged List: " + list1);
  }
}
