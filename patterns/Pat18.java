/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
public class Pat18 {

    public static void main(String[] args) {
        int n = 4;
        //upperpart
        for (int i = 1; i <= n; i++) {
            //outerspace
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=(2*i)-1; j++) {
                if (j == 1 || j == (2*i)-1) {
                    System.out.print("*");
                }
                //innerspaces
                else {
                  System.out.print(" ");
                }
            }

            System.out.println();
        }

        //upperpart
        for (int i = n-1; i >= 1; i--) {
            //outerspace
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <=(2*i)-1; j++) {
                if (j == 1 || j == (2*i)-1) {
                    System.out.print("*");
                }
                //innerspaces
                else {
                  System.out.print(" ");
                }
            }

            System.out.println();
    }
}
}
