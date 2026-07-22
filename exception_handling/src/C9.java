import java.util.Scanner;

public class C9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new Exception("Not eligible for voting");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
