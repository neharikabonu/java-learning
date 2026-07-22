public class ReverseWords {
    public static void main(String[] args) {
        String str = "Welcome To Java";

        int end = str.length();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                System.out.print(str.substring(i + 1, end) + " ");
                end = i;
            }
        }

        System.out.print(str.substring(0, end));
    }
}