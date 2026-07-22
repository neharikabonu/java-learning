public class C2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "John", 50000);
        System.out.println(emp1);
    }
}

class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Details:\nID: "+id+"\nName: "+name+"\nSalary: "+salary;
    }
}