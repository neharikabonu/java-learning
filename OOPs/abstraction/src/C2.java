package OOPs.abstraction.src;

public class C2 {
    public static void main(String[] args) {
        Employee2 FTEmp = new FTEmp(101, "Santosh", 50000);
        FTEmp.calSalary();
        System.out.println();

        Employee2 PTEmp = new PTEmp(102, "Neharika", 120, 250);
        PTEmp.calSalary();
        System.out.println();
    }
}

abstract class Employee2 {
   int empID;
   String empName;

   abstract void calSalary();

   Employee2(int empID, String empName) {
       this.empID = empID;
       this.empName = empName;
   }


}

class FTEmp extends Employee2 {
    int salary;

    FTEmp(int empID, String empName, int salary) {
        super(empID, empName);
        this.salary = salary;
    }

    @Override
    void calSalary() {
        System.out.println("ID: "+empID+"\nName: "+empName+"\nMonthly Salary: "+salary);
    }
}

class PTEmp extends Employee2 {
    int hoursWorked;
    int ratePerHour;

    PTEmp(int empID, String empName, int hoursWorked, int ratePerHour) {
        super(empID, empName);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calSalary() {
        System.out.println("ID: "+empID+"\nName: "+empName+"\nHours Worked: "+hoursWorked+"\nRate Per Hour: "+ratePerHour);
        System.out.println("Salary: "+ (hoursWorked * ratePerHour));
    }
}