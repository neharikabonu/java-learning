import java.util.PriorityQueue;
import java.util.Scanner;

public class C3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      queue.offer(sc.nextInt());
    }

    System.out.println("Original: " + queue);

    while (!queue.isEmpty()) {
      System.out.println("Removed: " +queue.poll());
    }

    System.out.println("Final: " + queue);
  }
}
