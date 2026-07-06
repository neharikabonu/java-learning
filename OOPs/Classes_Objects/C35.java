package OOPs.Classes_Objects;

public class C35 {
    public static void main(String[] args) {
        StudentDetail s1 = new StudentDetail(01, "Neharika");

        Teachers t1 = new Teachers(101, "Neha");

        Subjects sub1 = new Subjects(1001, "Java");

        System.out.println(s1.id+", "+s1.name);
        System.out.println(t1.id+", "+t1.name);
        System.out.println(sub1.id+", "+sub1.name);
    }
}

class StudentDetail {
    int id;
    String name;

    StudentDetail(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Teachers {
    int id;
    String name;
    Teachers(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Subjects {
    int id;
    String name;
    Subjects(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

