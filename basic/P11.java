package basic;

import java.util.Scanner;

//product of digits

public class P11 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number: ");
    int num = sc.nextInt();
    int prod = 1;
    while (num!=0){
      int digit = num%10;
      prod = prod * digit;
      num = num/10;
    } System.out.println(prod);
  }
}
