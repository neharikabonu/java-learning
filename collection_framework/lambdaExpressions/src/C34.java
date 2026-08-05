import java.util.*;

public class C34 {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(103, "Ravi", 85),
                    new Student(101, "Anjali", 92),
                    new Student(102, "Raj", 78)
            )
    );

    Collections.sort(students, (a, b) -> a.marks - b.marks);
    students.forEach(x -> {
      System.out.println(x.name + " - " + x.marks);
    });
  }
}

class Student {
  int id;
  String name;
  int marks;

  Student(int id, String name, int marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
  }
}
