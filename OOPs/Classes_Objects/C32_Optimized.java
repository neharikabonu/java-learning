package OOPs.Classes_Objects;

public class C32_Optimized {
    public static void main(String[] args) {
        StudentMarks[] studentDetails = {
                new StudentMarks (101, "Neharika", 78),
                new StudentMarks(102, "Neha", 99),
                new StudentMarks(103, "Neharika B", 100)
        };

        StudentMarks topper = studentDetails[0];

        for (StudentMarks sd : studentDetails) {
            if (sd.marks > topper.marks) {
                topper = sd;
            }
        }

        topper.displayDetails();
    }
}

class StudentMarks {
    int id;
    String name;
    int marks;

    StudentMarks(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("ID: "+id+"\nName: "+name+"\nMarks: "+marks);
    }
}