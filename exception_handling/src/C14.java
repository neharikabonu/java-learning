public class C14 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mult(a,b));

        try {
            System.out.println(div(a,b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int sub(int a, int b) {
        return a-b;
    }

    public static int mult(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}
