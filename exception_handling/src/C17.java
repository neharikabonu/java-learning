public class C17 {
    public static void main(String[] args) {
        try {
            getMarks(101);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        System.out.println("Marks: "+marks);
    }

}

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}