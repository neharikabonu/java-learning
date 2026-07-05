package methods;

public class M5 {
  public static void printSquare() {
    for (int i=1; i<=4; i++) {
      for (int j=1; j<=4; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    printSquare();
  }
}
