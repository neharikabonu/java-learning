public class C1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Neharika");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}

final class Student {
    private final int id;
    private final String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
      return id;
    }

    public String getName() {
        return name;
    }


}