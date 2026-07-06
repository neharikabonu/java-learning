package OOPs.Classes_Objects;

public class C2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.empId = 101;
        emp1.empName = "Neharika";
        emp1.salary = 56000;
        emp2.empId = 102;
        emp2.empName = "Neha";
        emp2.salary = 65000;
        emp1.printEmpDetails();
        emp2.printEmpDetails();
    }
}

class Employee {
    int empId;
    String empName;
    int salary;

    void printEmpDetails(){
        System.out.println("Employee ID: "+empId+"\nEmployee Name: "+empName+"\nSalary: "+salary);
        System.out.println();
    }
}