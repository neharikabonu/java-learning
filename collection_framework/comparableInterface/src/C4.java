import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int id = sc.nextInt();
      String name = sc.next();
      list.add(new Student(id, name));
    }

    System.out.println("Original: ");
    for (Student s : list) {
      System.out.println(s.id +": " +s.name);
    }

    Collections.sort(list);
    System.out.println("After Sorting: ");
    for (Student s : list) {
      System.out.println(s.id +": " +s.name);
    }
  }
}

class Student implements Comparable<Student> {
  int id;
  String name;

  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public int compareTo(Student student) {
    return this.id - student.id;
  }
}