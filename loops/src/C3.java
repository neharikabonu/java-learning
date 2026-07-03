public class C3 {
    public static void main(String[] args) {
        int n = 123456;
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
