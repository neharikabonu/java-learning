public class C8 {
    public static void main(String[] args) {

    int n = 123456;
    int evenSum = 0;
    int evenCount = 0;
    int oddCount = 0;
    int oddSum = 0;

    while (n != 0) {
        int digit = n % 10;
        if (digit % 2 == 0) {
            evenSum += digit;
            evenCount++;
        } else {
            oddSum += digit;
            oddCount++;
        }
        n = n/10;
    }
        System.out.println("EvenSum: "+evenSum);
        System.out.println("EvenCount: "+evenCount);

        System.out.println("OddSum: "+oddSum);
        System.out.println("OddCount: "+oddCount);
    }
}
