package OOPs.Classes_Objects;

public class C27 {
    public static void main(String[] args) {
        StudentClass[] stud = new StudentClass[3];
        stud[0] = new StudentClass(101, "Neha");
        stud[1] = new StudentClass(102, "Harika");
        stud[2] = new StudentClass(103, "Neharika");

        for (int i=0; i< stud.length; i++) {
            System.out.println(stud[i].id);
            System.out.println(stud[i].name);
        }
    }
}

class StudentClass {
    int id;
    String name;

    StudentClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
}