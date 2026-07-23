import java.util.*;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    String input = sc.next();

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else if ((ch == ')' || ch == '}' || ch == ']') && stack.empty()) {
        System.out.println("Not balanced");
        return;
      } else {
        char top = stack.peek();
        if ((top == '(' && ch == ')') ||
                (top == '{' && ch == '}') ||
                (top == '[' && ch == ']')) {
          stack.pop();
        } else {
          System.out.println("Not balanced");
          return;
        }
      }
    }

    if (stack.empty()) {
      System.out.println("Balanced");
    } else {
      System.out.println("Not balanced");
    }
  }
}
