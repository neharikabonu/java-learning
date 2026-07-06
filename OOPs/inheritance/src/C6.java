package OOPs.inheritance.src;

public class C6 {
    public static void main(String[] args) {
        EngineeringStudent6 e1 = new EngineeringStudent6(101, "Neharika", "CSE");
        e1.display();

        EngineeringStudent6 e2 = new EngineeringStudent6(102, "Neha", "ECE");
        e2.display();
    }
}

class Student6 {
    int id;
    String name;

    Student6(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EngineeringStudent6 extends Student6 {
    String branch;

    EngineeringStudent6(int id, String name, String branch) {
        super(id, name);
        this.branch = branch;
    }

    void display() {
        System.out.println("ID: "+id+"\nName: "+name+"\nBranch: "+branch);
        System.out.println();
    }
}