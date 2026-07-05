package methods;

public class M16 {
  public static int sumDigits (int n){
    int sum = 0;
    while (n!=0) {
      int digit = n%10;
      sum += digit;
      n = n/10;
    }
    return sum;
  }
  public static void main(String[] args) {
    System.out.println(sumDigits(1234));
  }
}
