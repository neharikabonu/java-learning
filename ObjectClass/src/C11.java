public class C11 {
    public static void main(String[] args) {
        Employee11 emp1 = new Employee11(101);
        Employee11 emp2 = new Employee11(101);
        Employee11 emp3 = new Employee11(103);
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));

        System.out.println(emp1.hashCode() == emp2.hashCode());
        System.out.println(emp1.hashCode() == emp3.hashCode());
    }
}

class Employee11 {
    int empId;

    Employee11(int empId) {
        this.empId = empId;
    }

    @Override
    public boolean equals(Object obj) {
        Employee11 e = (Employee11) obj;
        return this.empId == e.empId;
    }

    @Override
    public int hashCode() {
        return empId;
    }
}