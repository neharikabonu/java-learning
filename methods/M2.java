public class M2 {

  public static int fact(int n){
    int fact = 1;
    for (int i=1; i<=n; i++) {
      fact *= i;
    } return fact;
  }
  public static void main(String[] args) {
    int n = 5;
    for (int i=0; i<n; i++) {
      //spaces
      for (int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for (int j=0; j<=i; j++) {
        if (i==j || j==0) {
          System.out.print(1+" ");
        }
        else {
          int nCr = (fact(i))/(fact(j)*(fact(i-j)));
          System.out.print(nCr+" ");
        }
      }
      System.out.println();
    }
  }
}