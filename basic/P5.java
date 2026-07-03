package basic;

import java.util.Scanner;

public class P5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input table number: ");
    int num = sc.nextInt();
    System.out.println("input limit of the table");
    int limit = sc.nextInt();
    for (int i=1; i<= limit; i++){
      System.out.println(num + "x "+i+" = "+ (num*i));
    }
  }
}
