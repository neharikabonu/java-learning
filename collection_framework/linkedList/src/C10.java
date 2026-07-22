import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new LinkedList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    System.out.println("Original: " + list);

    int num = list.removeFirst();
    list.addLast(num);

    System.out.println(list);
  }
}
