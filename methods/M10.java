package methods;

public class M10 {
  public static void printPrimes(int start, int end){
    for (int i=start; i<=end; i++){
      boolean isPrime = true;
      for (int k=2; k<=i/2; k++){
        if (i%k==0){
          isPrime = false;
          break;
        }
      }
      if (isPrime){
        System.out.print(i+" ");
      }
  }
  }
  public static void main(String[] args) {
    printPrimes(5, 15);
  }
}
