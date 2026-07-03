package basic;
//strong number: 1! + 4! + 5! = 145
import java.util.Scanner;

public class P14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number: ");
    int num = sc.nextInt();
    int num1 = num;
    int res = 0;
    while (num!=0){
      int digit = num%10;
      int fact = 1;
      for (int i=1; i<=digit; i++){
        fact = fact * i;
      }
      res = res + fact;
      num = num/10;
    }
    if (num1 == res) {
      System.out.println("Strong Number");
    } else {
      System.out.println("Not a strong number");
    }
  }
}
