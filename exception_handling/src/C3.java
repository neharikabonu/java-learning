import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        try {
            int res = Integer.parseInt(num);
            System.out.println(res);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }
    }
}
