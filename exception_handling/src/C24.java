import java.util.Scanner;

public class C24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        int password = sc.nextInt();

        Credentials c1 = new Credentials(username, password);

        try {
            if (!c1.username.equals("admin") || c1.password != 1234) {
                throw new InvalidCredentialsException("Invalid Credentials");
            }
            System.out.println("Successfully logged in");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Credentials {
    String username;
    int password;

    Credentials(String username, int password) {
        this.username = username;
        this.password = password;
    }
}

class InvalidCredentialsException extends Exception {
     InvalidCredentialsException(String message) {
        super(message);
    }
}