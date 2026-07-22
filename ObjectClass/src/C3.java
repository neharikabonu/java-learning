public class C3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3(101, "Ram");
        Student3 s2 = new Student3(101, "Ram");

        System.out.println(s1.equals(s2));
    }
}

class Student3 {
    int id;
    String name;

    Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student3 s = (Student3) obj;
        return this.id == s.id && this.name == s.name;
    }
}