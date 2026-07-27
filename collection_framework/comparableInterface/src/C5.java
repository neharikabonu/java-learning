import java.util.*;

public class C5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Student1> list = new ArrayList<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      list.add(new Student1(sc.nextInt(), sc.next()));
    }

    Collections.sort(list);
    for (Student1 s : list) {
      System.out.println(s.id +": " + s.name);
    }
  }
}

class Student1 implements Comparable<Student1> {
  int id;
  String name;

  Student1(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public int compareTo(Student1 student) {
    return this.name.compareTo(student.name);
  }
}
