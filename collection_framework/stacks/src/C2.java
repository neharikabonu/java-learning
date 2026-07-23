import java.util.Scanner;
import java.util.Stack;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    String input = sc.next();

    for (int i = 0; i < input.length(); i++) {
      stack.push(input.charAt(i));
    }

    System.out.println(stack);
    StringBuilder sb = new StringBuilder();
    while (!stack.empty()) {
      char ch = stack.pop();
      sb.append(ch);
    }

    System.out.println(sb);
  }
}
