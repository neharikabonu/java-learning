import java.util.ArrayDeque;
import java.util.Scanner;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num % 2 == 0) {
        queue.offerFirst(num);
      } else {
        queue.offerLast(num);
      }
    }

    System.out.println(queue);
  }
}
