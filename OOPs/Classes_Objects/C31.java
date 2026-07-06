package OOPs.Classes_Objects;

public class C31 {
    public static void main(String[] args) {
        EmployeeSalary e1 = new EmployeeSalary(50000);
        EmployeeSalary e2 = new EmployeeSalary(76000);
        EmployeeSalary e3 = new EmployeeSalary(55000);

        int totSal = e1.salary + e2.salary + e3.salary;
        System.out.println(totSal);

    }
}

class EmployeeSalary{
    int salary;
    EmployeeSalary(int salary){
        this.salary = salary;
    }
}
