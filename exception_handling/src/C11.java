public class C11 {
    public static void main(String[] args) {
        try {
            enterPassword("neharika123");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void enterPassword (String password) {
        if ((password.length() < 8) || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid password");
        }
        System.out.println("Password Accepted");
    }
}
