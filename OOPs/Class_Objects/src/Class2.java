//parameterized constructor

public class Class2 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Neharika", 22, 'A');
        s1.printDetails();
    }
}

class Student {
    int id;
    String name;
    int age;
    char grade;

    Student (int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void studAttendance () {
        System.out.println("Student "+id+ " marked present");
    }

    void printDetails() {
        System.out.println("ID :" +id);
        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
        System.out.println("Grade :" +grade);
        studAttendance();
    }
}