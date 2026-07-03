public class C1 {
    public static void main(String[] args) {

        int n = 1234;
        int temp = n;
        int last = n % 10;
        int first = 0;
        int count = 0;

        //first_digit
        while (n != 0) {
            first = n % 10;
            count++;
            n /= 10;
        }

        //to increase the digits place
        int pow = 1;
        for (int i = 1; i < count; i++) {
            pow *= 10;
        }

        //to reverse the middle part of the number
        int revNum = 0;
        while (temp > 10) {
            int digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp /= 10;
        }

        //to extract the middle part of the number
        int mid = 0;
        while (revNum > 10) {
            int digit = revNum % 10;
            mid = mid * 10 + digit;
            revNum /= 10;
        }
        int newNum = (last * pow) + ( mid * 10 + first);
        System.out.println(newNum);
    }
}