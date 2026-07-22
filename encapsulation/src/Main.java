public class Main {
    public static void main(String[] args) {
        int n = 5;
        if (n % 2 != 0) {
            System.out.println(" odd Weird");
        } else if (n % 2 == 0) {
                if (n>= 2 && n<= 5) {
                    System.out.println("Not weird");
            } else if (n>=6 && n<=20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not weird");
                }
        }
    }
}