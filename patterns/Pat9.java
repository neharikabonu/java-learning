public class Pat9 {

  /*
  n=4

   *
  * *
 *   *
*******
  */
  public static void main(String[] args) {
      int n = 4;
      for (int i=1; i<=n; i++){
        //spaces
        for (int j=1; j<=n-i; j++){
          System.out.print(" ");
        }
        if (i==1){
          System.out.print("*");
          
        }
        else if (i==n){
          for (int j=1; j<=(2*n)-1; j++){
          System.out.print("*");
        }
        System.out.println();
        } else {
          System.out.print('*');
          for (int j=1; j<=(2*i)-3; j++){
            System.out.print(" ");
          }
          System.out.print("*");
        }
        System.out.println();
      }
  }
}
