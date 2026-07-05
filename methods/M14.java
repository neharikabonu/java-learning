package methods;

public class M14 {
  public static int fact(int n) {
    int fact = 1;
    for (int i=1; i<=n; i++) {
      fact *= i;
    }
    return fact;
  }
  public static void main(String[] args) {
    int res =fact(5);
    System.out.println(res);
  }
}
