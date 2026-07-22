import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();

        try {
            Student s =
                    new Student(id, name, marks);

            s.display();
        }
        catch (InvalidIDException |
               NullNameException |
               InvalidMarksException1 e) {

            System.out.println(e.getMessage());
        }

    }
}

class Student {
    int id;
    String name;
    double marks;

    Student(int id) throws InvalidIDException {
        if (id <= 100) {
            throw new InvalidIDException("Invalid ID");
        }
        this.id = id;
    }

    Student(int id, String name) throws InvalidIDException,
            NullNameException {
        this(id);
        //name logic
        if(name == null || name.trim().isEmpty()) {
            throw new NullNameException("Name cannot be empty");
        }
        this.name = name;
    }

    Student(int id, String name, double marks) throws InvalidIDException,
            NullNameException, InvalidMarksException1 {
        this(id, name);
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException1("Invalid marks");
        }
        this.marks = marks;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

//exceptions
class InvalidIDException extends Exception {
    InvalidIDException(String message) {
        super(message);
    }
}

class InvalidMarksException1 extends Exception {
    InvalidMarksException1(String message) {
        super(message);
    }
}

class NullNameException extends Exception {
    NullNameException(String message) {
        super(message);
    }
}