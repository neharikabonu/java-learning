public class C2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Neharika", 65000);
        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
}

final class Employee {
    final private int empId;
    final private String name;
    final private double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    //getters
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}