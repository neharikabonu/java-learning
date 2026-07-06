import java.util.Random;
import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        StudentResultSystem students = new StudentResultSystem(101, "Neharika");
        students.setMarks();
        students.displayDetails();
    }
}

class StudentResultSystem {
    private int id;
    private String name;

    private int[] marks = new int[5];

    StudentResultSystem(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Scanner sc = new Scanner(System.in);
    public void setMarks() {
        System.out.println("Enter marks: ");
        for (int i=0; i<marks.length; i++) {
            if (marks[i] >= 0 && marks[i] <= 100) {
                marks[i] = sc.nextInt();
            } else {
                System.out.println("Marks should be between 0 and 100");
            }
        }
    }

    public int calcTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    public double calcPercent() {
        return calcTotal() / 5.0;
    }

    public char calcGrade() {
        double percent = calcPercent();

        if (percent >= 90) {
            return 'A';
        } else if (percent >= 75) {
            return 'B';
        } else if (percent >= 60) {
            return 'C';
        } else if (percent >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayDetails() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Total: "+calcTotal());
        System.out.println("Percentage: "+calcPercent());
        System.out.println("Grade: "+calcGrade());
        System.out.println();
    }
}