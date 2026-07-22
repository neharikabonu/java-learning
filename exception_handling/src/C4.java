public class C4 {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
