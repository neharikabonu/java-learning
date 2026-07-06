public class C2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Neharika");
        emp1.printDetails();
        emp1.setSalary(56000);
        emp1.getSalary();
        emp1.calculateAnnSal();
    }
}

class Employee  {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary>=0) {

        this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public void getSalary() {
        System.out.println("Salary: "+salary);
    }

    public void calculateAnnSal() {
        System.out.println("Annual Salary: "+salary*12);
    }

    public void printDetails() {
        System.out.println("Id: "+id );
        System.out.println("Name: "+name);
    }
}