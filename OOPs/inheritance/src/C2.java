package OOPs.inheritance.src;

public class C2 {
    public static void main(String[] args) {
        Developer2 de1 = new Developer2(101, "Neharika", "Java");
        de1.display();
    }
}

class Employee2 {
    int empId;
    String empName;

    Employee2(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}

class Developer2 extends Employee2 {
    String progLang;

    Developer2(int empId, String empName, String progLang) {
        super(empId, empName);
        this.progLang = progLang;
    }

    void display() {
        System.out.println("ID: "+empId+"\nName: "+empName+"\nProgramming Language: "+progLang);
    }
}