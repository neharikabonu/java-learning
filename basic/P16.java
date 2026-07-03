package basic;
//prime numbers range
import java.util.Scanner;

public class P16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input range");
    int num = sc.nextInt();
    for (int i = 2; i <= num; i++){
      boolean isPrime = true;
      for (int j=2; j<i; j++){
        if (i%j == 0){
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        System.out.print(i+" ");
      }
    }
  }
}
