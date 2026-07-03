package basic;

import java.util.Scanner;
//fibanacci series

public class P9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input limit");
    int num = sc.nextInt();
    int prev = 0, pres = 1;
    if (num == 1){
      System.out.print(prev +" ");
      return;
    }
    System.out.print(prev +" " +pres +" ");
    for (int i = 3; i <= num; i++){
      int next = prev + pres;
      System.out.print(next + " ");
      prev = pres;
      pres = next;
    }
  }
}
