package methods;

public class M4 {
  public static void printEven() {
    for (int i=1; i<=50; i++) {
      if (i%2==0){
        System.out.print(i+" ");
      }
    }
  }
  public static void main(String[] args) {
    printEven();
  }
}
