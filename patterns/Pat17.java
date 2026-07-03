public class Pat17 {
  public static void main(String[] args) {
    int n = 3;
    for (int i=1; i<=n; i++){
      for (int j=1; j<=n*2; j++){
        if ((i+j)%2==0){
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
