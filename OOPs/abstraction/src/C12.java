package OOPs.abstraction.src;

public class C12 {
    public static void main(String[] args) {
        Course java = new JavaCourse(1001, "Java");
        java.showCourseDetails();
        Certificate java1 = new JavaCourse(1001, "Java");
        java1.generateCertificate();
    }
}

abstract class Course {
    int courseID;
    String courseName;

    Course(int courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    abstract void showCourseDetails();
}

interface Certificate {
    void generateCertificate();
}

class JavaCourse extends Course implements Certificate {
    JavaCourse(int courseID, String courseName) {
        super(courseID, courseName);
    }

    @Override
    void showCourseDetails() {
        System.out.println("Course ID: "+courseID+"\nCourse Name: "+courseName);

    }

    @Override
    public void generateCertificate() {
        System.out.println("JAVA Certificate");
    }
}

class PythonCourse extends Course implements Certificate {
    PythonCourse(int courseID, String courseName) {
        super(courseID, courseName);
    }

    @Override
    void showCourseDetails() {
        System.out.println("Course ID: "+courseID+"\nCourse Name"+courseName);

    }

    @Override
    public void generateCertificate() {
        System.out.println("Python Certificate");
    }
}