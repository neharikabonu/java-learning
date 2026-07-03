package basic;

import java.util.Scanner;
//palindrome check
public class P10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number: ");
    int num = sc.nextInt();
    int num1 = num;
    int rev = 0;
    while (num!=0){
      int digit = num%10;
      rev = rev * 10 + digit;
      num = num/10;
    }
    if (rev == num1 ){
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a Palindrome");
    }
  }
}
