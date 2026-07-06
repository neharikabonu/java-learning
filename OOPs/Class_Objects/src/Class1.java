

class StudentDetails {
    //attributes / properties
    int id;
    String name;
    int age;
    char grade;

    //behaviour
    void markAttendance() {
        System.out.println("Attendance marked by "+name);
    }

    void printDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        markAttendance();
    }
}
public class Class1 {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();
        s1.name = "Amit";
        s1.id = 101;
        s1.age = 23;
        s1.grade = 'A';

        s2.name = "Brindha";
        s2.id = 103;
        s2.age = 22;
        s2.grade = 'A';
        s1.printDetails();
        System.out.println();
        s2.printDetails();
    }
}
