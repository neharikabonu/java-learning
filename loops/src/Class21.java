public class Class21 {
    public static void main(String[] args) {
        int n = 1234;

        int k = 2;
        for (int i = 1; i <= k; i++) {
            int last_digit = n % 10;
            int num = n / 10;

            int temp = n;
            int pow = 1;

            while (temp>10) {
                pow *= 10;
                temp /= 10;
            }
            n = (last_digit * pow) + num;
        }
        System.out.println(n);
    }
}
