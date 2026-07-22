import java.util.*;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    System.out.println("First: " + list.getFirst());
    System.out.println("Last: " + list.getLast());
  }
}
