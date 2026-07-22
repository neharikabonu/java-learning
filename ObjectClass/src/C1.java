public class C1 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Neharika");
        System.out.println(s1); // java automatically calls toString()
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student {id = "+id+", name = '"+name+"'}";
    }
}