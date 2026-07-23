import java.util.*;

public class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    Vector<Integer> vector = new Vector<>();
    List<Integer> list = new Vector<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    System.out.println(list);
  }
}
