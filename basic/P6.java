package basic;

import java.util.Scanner;

public class P6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input number: ");
    int num = sc.nextInt();
    boolean isPrime = true;
    if (num == 1 || num == 0){
      System.out.println("Not a Prime Number");
      return;
    } else if (num == 2){
      System.out.println("Prime Number");
      return;
    }
    for (int i=2; i<num; i++){
      if (num%i==0){
        isPrime = false;
        break;
      }
    }
    if (isPrime){
      System.out.println("Prime Number");
    } else {
      System.out.println("Non-Prime Number");
    }
  }
}
