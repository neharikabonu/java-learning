import java.util.*;

class P1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input a number: ");
    int num = sc.nextInt();
    if (num>=0){
      System.out.println("Positive");
    } else {
      System.out.println("Negative");
    }
  }
}