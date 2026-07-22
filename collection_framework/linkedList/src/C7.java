import java.util.*;

public class C7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    Iterator<Integer> it = list.iterator();

    int max = it.next();

    while (it.hasNext()) {
      int num = it.next();
      if (num > max) {
        max = num;
      }
    }

    System.out.println(max);
  }
}
