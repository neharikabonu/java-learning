public class CountDigitsSpecial {
    public static void main(String[] args) {
        String str = "abc123@#$";

        int digitCount = 0;
        int specialCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            }
            else if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                specialCount++;
            }
        }

        System.out.println("Digits = " + digitCount);
        System.out.println("Special Characters = " + specialCount);
    }
}