package basic;
//armstrong number
import java.util.Scanner;

public class P13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number: ");
    int num = sc.nextInt();
    int num1 = num;
    int res = 0;
    while (num!=0){
      int digit = num%10;
      res = res + (digit*digit*digit);
      num = num/10;
    } 
    if (res == num1) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not an Armstrong Number");
    }
  }
}
