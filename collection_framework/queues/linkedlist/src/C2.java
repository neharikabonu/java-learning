import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> queue = new LinkedList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      queue.offer(sc.nextInt());
    }

    System.out.println(queue);

    System.out.println("Front element: " + queue.peek());

    System.out.println(queue);
  }
}
