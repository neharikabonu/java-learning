public class C5 {
    public static void main(String[] args) {
        int n = 12321;
        int temp = n;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        if (temp == rev ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
