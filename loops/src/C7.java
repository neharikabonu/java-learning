public class C7 {
    public static void main(String[] args) {

        int n = 58249;
        int smallest = n % 10;

        while (n != 0) {
            int digit = n % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            n = n / 10;
        }
        System.out.println(smallest);
    }
}
