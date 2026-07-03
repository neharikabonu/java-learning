public class Class16 {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;

        while(n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }


        while (rev != 0) {
            int digit = rev % 10;
            System.out.println(digit);
            rev = rev / 10;
        }

    }
}
