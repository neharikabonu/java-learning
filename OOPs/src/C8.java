public class C8 {
    public static void main(String[] args) {
        Employee8 e;

        e = new Developer(50000);
        System.out.println(e.calculateTax());

        e = new Tester(50000);
        System.out.println(e.calculateTax());

        e = new Manager(50000);
        System.out.println(e.calculateTax());
    }
}

abstract class Employee8 {
    double salary;
    abstract double calculateTax();
    Employee8(double salary){
        this.salary = salary;
    }
}

class Developer extends Employee8{
    @Override
    double calculateTax() {
        return salary * 0.1;
    }

    Developer(double salary) {
        super(salary);
    }
}

class Manager extends Employee8 {
    @Override
    double calculateTax() {
        return salary * 0.15;
    }

    Manager(double salary) {
        super(salary);
    }
}

class Tester extends Employee8 {
    @Override
    double calculateTax() {
        return salary * 0.08;
    }

    Tester(double salary) {
        super(salary);
    }
}