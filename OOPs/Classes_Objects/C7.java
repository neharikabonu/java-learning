package OOPs.Classes_Objects;

public class C7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Neharika";
        System.out.println(s1.id+", "+s1.name);
    }
}

class Student {
    int id;
    String name;
}