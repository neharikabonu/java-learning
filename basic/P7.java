package basic;

import java.util.Scanner;

public class P7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number: ");
    int num = sc.nextInt();
    int rev = 0;
    while (num!=0){
      int digit = num % 10;
      rev = rev * 10 + digit;
      num = num/10;
    }
    System.out.println(rev);
  }
}
