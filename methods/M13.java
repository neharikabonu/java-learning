package methods;

public class M13 {
  public static int largest(int a, int b) {
    int res = a>b ? a:b;
    return res;
  }
  
  public static void main(String[] args) {
    System.out.println(largest(5,6));
  }
}
