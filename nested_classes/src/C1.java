public class C1 {
    public static void main(String[] args) {
        Company.Employee emp1 = new Company.Employee();
        emp1.display();
    }
}

class Company {
    static class Employee {
        void display() {
            System.out.println("Employee Details");
        }
    }
}