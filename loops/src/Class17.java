public class Class17 {
    //printing all unique digits in a number
    public static void main(String[] args) {
        int n = 1223341;
        while (n != 0) {
            int digit = n % 10;
            int temp = n/10;
            boolean found = false;
            while (temp != 0) {
                int digit1 = temp % 10;
                if (digit == digit1) {
                    found = true;
                    break;
                }
                temp = temp / 10;
            }
            if(!found) {
                System.out.println(digit);
            }
        n = n / 10;
        }
    }
}
