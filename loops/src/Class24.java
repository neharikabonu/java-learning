public class Class24 {
    public static void main(String[] args) {
        int n = 1234;
        int target = 3412;

        //k rotations logic
        int k = 2;
        for (int i = 1; i <= k; i++) {
            int last_digit = n % 10;
            int first_digit = 0;

            int temp = n;
            int temp2 = n;
            while (temp != 0) {
                first_digit = temp % 10;
                temp /= 10;
            }

            int pow = 1;
            while (temp2 > 10) {
                pow *= 10;
                temp2 /= 10;
            }
            int num = ( (last_digit * pow ) * 10 ) + last_digit;
            System.out.println(num);
        }
    }
}
