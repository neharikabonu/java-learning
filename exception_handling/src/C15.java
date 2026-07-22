public class C15 {
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Not eligible for voting " + age);
        }
        System.out.println("Eligible for voting");

    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}