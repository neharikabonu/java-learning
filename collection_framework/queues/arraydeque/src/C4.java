import java.util.ArrayDeque;
import java.util.Scanner;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      queue.offer(sc.nextInt());
    }

    System.out.println(queue);

    System.out.println("First element: " +queue.pollFirst());
    System.out.println("Last element: " +queue.pollLast());

    System.out.println(queue);
  }
}
