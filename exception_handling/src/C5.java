public class C5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int arr[] = {1, 2, 3, 4, 5};

        String num = "abc";
        try {
//            int res = a/b;
//            System.out.println(res);

//            System.out.println(arr[6]);

            System.out.println(Integer.parseInt(num));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array reached to the end");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }

    }
}
