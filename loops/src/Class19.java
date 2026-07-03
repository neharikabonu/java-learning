public class Class19 {
    public static void main(String[] args) {
        int n = 1234;

        int temp = n;
        int pow = 1;
        while (temp>10) {
            int digit = temp % 10;
            pow = pow * 10;
            temp /= 10;
        }
        n = n % pow;
        System.out.println(n);
    }
}
