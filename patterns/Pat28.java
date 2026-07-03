public class Pat28 {
  public static void main(String[] args) {
    int n=5;
    int mid = (n/2)+1;
    for (int i=1; i<=n; i++){
      //spaces
      for (int j=1; j<=n; j++){
        if (i==mid || j==mid){
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
  }
}
