package OOPs.inheritance.src;

public class C26 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "neharika.bonu","neharikabonu@gmail.com", "Java Full Stack");
        s1.display();

        Instructor i1 = new Instructor(101, "manoj", "manoj@gmail.com", "Java");
        i1.display();
    }
}
class User {
    int userId;
    String username;
    String email;

    User(int userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }
}

class Student extends User {
    String courseEnrolled;

    Student(int userId, String username, String email, String courseEnrolled) {
        super(userId, username, email);
        this.courseEnrolled = courseEnrolled;
    }

    void display() {
        System.out.println("Student Details: \nUser ID: "+userId+"\nUsername: "+username+"\nEmail: "+email+"\nCourse Enrolled: "+courseEnrolled);
        System.out.println();
    }
}

class Instructor extends User {
    String subject;

    Instructor(int userId, String username, String email, String subject) {
        super(userId, username, email);
        this.subject = subject;
    }

    void display() {
        System.out.println("Instructor Details: \nUser ID: "+userId+"\nUsername: "+username+"\nEmail: "+email+"\nSubject: "+subject);
        System.out.println();
    }
}