public class Class15 {
    public static void main(String[] args) {
        int num = 122332;
        int digit = 2;

        int count = 0;

        while (num != 0) {
            int n = num % 10;
            if (n == digit) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
