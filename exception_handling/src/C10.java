public class C10 {
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        System.out.println("Valid Number");
    }
}
