//optimized constructor chaining
public class Class4 {
    public static void main(String[] args) {
        StudentDetail s1 = new StudentDetail();
        s1.displayDetails();
        System.out.println();
        StudentDetail s2 = new StudentDetail(101);
        s2.displayDetails();
        System.out.println();
        StudentDetail s3 = new StudentDetail(101, "Neharika");
        s3.displayDetails();
        System.out.println();
        StudentDetail s4 = new StudentDetail(101, "Neharika", 22);
        s4.displayDetails();
        System.out.println();
        StudentDetail s5 = new StudentDetail(101, "Neharika", 22, 'A');
        s5.displayDetails();
    }
}

class StudentDetail {
    int id;
    String name;
    int age;
    char grade;

    void displayDetails() {
        System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nGrade: " + grade);
    }
    StudentDetail() {
        this(0);
    }

    StudentDetail(int id) {
        this(id, "unknown");
    }

    StudentDetail(int id, String name) {
        this(id, name,0);
    }

    StudentDetail(int id, String name, int age) {
        this(id, name, age, 'x');
    }

    StudentDetail(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}