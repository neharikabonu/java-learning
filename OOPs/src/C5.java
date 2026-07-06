public class C5 {
    public static void main(String[] args) {
        Employees e1 =
                new Employees(
                        "Neharika",
                        21,
                        101,
                        "Developer",
                        50000
                );
        e1.displayPerson();
        e1.displayAnnSalary();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        if (name!=null) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid Name");
        }

        if (age>=18) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    void displayPerson() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Employees extends Person {
    int id;
    String desig;
    double salary;

    Employees(String name, int age, int id, String desig, double salary) {
        super(name, age);
        if (id>0) {
            this.id = id;
        } else {
            System.out.println("Invalid Employee ID");
        }

        if (desig.equalsIgnoreCase("developer")|| desig.equalsIgnoreCase("tester")||desig.equalsIgnoreCase("manager")|| desig.equalsIgnoreCase("hr")) {
            this.desig = desig;
        } else {
            System.out.println("Invalid Designation");
        }

        if (salary>0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }
    double calcAnnSal() {
        return salary * 12;
    }

    void displayPerson() {
        super.displayPerson();
        System.out.println("Employee ID: "+id);
        System.out.println("Designation: "+desig);
        System.out.println("Salary: "+salary);
    }

    void displayAnnSalary() {
        System.out.println("Annual Salary: "+calcAnnSal());
    }
}