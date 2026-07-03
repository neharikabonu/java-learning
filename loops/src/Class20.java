public class Class20 {
    public static void main(String[] args) {
        int num = 1234;

        int k = 2;
        for (int i = 1; i <= k; i++) {
            int temp = num;
            int first_digit = 0;
            while (temp != 0) {
                first_digit = temp % 10;
                temp /= 10;
            }
            temp = num;
            int pow = 1;
            while (temp > 10) {
                pow = pow * 10;
                temp /= 10;
            }

            num = ((num % pow) * 10) + first_digit;
        }
        System.out.println(num);
    }
}
