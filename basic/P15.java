package basic;
//perfecct number
import java.util.Scanner;

public class P15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number");
    int num = sc.nextInt();
    int fact = 0;
    for (int i=1; i<num; i++) {
      if (num%i==0){
        fact = fact + i;
      }
    }
    if (num == fact){
      System.out.println("Perfect number");
    } else {
      System.out.println("Not a perfect number");
    }
  }
}
