public class C2 {
    public static void main(String[] args) {
       int n = 1234;
       int prod = 1;
       while (n != 0) {
           int digit = n % 10;
           prod = prod * digit;
           n /= 10;
       }
        System.out.println(prod);
    }
}
