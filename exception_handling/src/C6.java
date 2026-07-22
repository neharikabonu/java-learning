public class C6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println((a/b));

        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero");
        } finally {
            System.out.println("Exception Handled");
        }
    }
}
