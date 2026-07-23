import java.util.*;

public class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      stack.push(sc.nextInt());
    }

    System.out.println("Original: " + stack);

    System.out.println("Top element: " + stack.peek());

    int count = 0;

//    System.out.println("Pop: ");
    while (!stack.empty()) {
      count++;
        stack.pop();
    }

    System.out.println("No of elements: " + count);
  }
}
