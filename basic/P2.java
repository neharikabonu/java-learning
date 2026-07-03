package basic;

import java.util.Scanner;

public class P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input a number: ");
    int num = sc.nextInt();
    if (num%2==0){
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
