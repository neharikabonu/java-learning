import java.util.Scanner;
import java.util.Stack;

public class C3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Character> stack = new Stack<>();
    String input = sc.next();

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '(') {
        stack.push(input.charAt(i));
      }
      else if (input.charAt(i) == ')' && stack.empty()){
        System.out.println("Not balanced");
        return;
      }
      else {

        if (!stack.empty()) {
          stack.pop();
        }
      }
    }

    if(stack.empty()) {
      System.out.println("Balanced");
    } else {
      System.out.println("Not balanced");
    }
  }
}
