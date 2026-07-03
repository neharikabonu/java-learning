public class C16 {
    public static void main(String[] args) {
        int n = 12;
        int fact = 1;
        for (int i=1; i<=n/2; i++) {
            if (n % i == 0) {
                fact++;
            }
        }
        System.out.println(fact);
    }
}
