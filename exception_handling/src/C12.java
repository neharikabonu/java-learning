public class C12 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    static void method2() {
        method3();
    }
    static void method3() {
        int a = 5/0;
    }
}
