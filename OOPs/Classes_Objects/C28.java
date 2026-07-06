package OOPs.Classes_Objects;

public class C28 {
    public static void main(String[] args) {
        Employees[] employee = {
                new Employees(101, "Neharika", 50000),
                new Employees(102, "Neha", 56000)
        };

        for (Employees emp : employee) {
            System.out.println(emp.id+", "+emp.name+", "+emp.salary);

        }
    }
}

class Employees{
    int id;
    String name;
    int salary;

    Employees(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}