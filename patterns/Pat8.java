public class Pat8 {
  public static void main(String[] args) {
    int n = 3;
    //outer loop
    for (int i=1; i<=n; i++){
      //spaces
      for (int j=1; j<=(n-i); j++){
        System.out.print(" ");
      }
      //stars
      for (int j=1; j<=(2*i)-1; j++) {
        System.out.print("*");
      }
      System.out.println();
      
  }

  for (int i=n-1; i>=1; i--){
      //spaces
      for (int j=1; j<=(n-i); j++){
        System.out.print(" ");
      }
      //stars
      for (int j=1; j<=(2*i)-1; j++) {
        System.out.print("*");
      }
      System.out.println();
}
}
}