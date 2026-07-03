public class C6 {
    public static void main(String[] args) {
        int n = 58987;
        int larDig = n % 10;

        while (n != 0) {
            int digit = n % 10;
            if (digit > larDig) {
                larDig = digit;
            }
            n = n/10;
        }
        System.out.println(larDig);
    }
}
