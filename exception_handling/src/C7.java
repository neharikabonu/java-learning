public class C7 {
    static void main(String[] args) {
        System.out.println(test());
    }
    public static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally");
        }
    }
}
//i dont understand why the output is finally and then 10