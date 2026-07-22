public class C1 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setId(101);
        s1.setName("Neharika");
        System.out.println("Student Details"+"\nID: "+s1.getId());
        System.out.println("Name: "+s1.getName());
        System.out.println();
        System.out.println("Employee Details");
        Employee emp1 = new Employee();
        emp1.setEmpId(101);
        emp1.setSalary(45000);
        System.out.println("ID: "+emp1.getEmpId());
        System.out.println("Salary: "+emp1.getSalary());
        System.out.println();
        System.out.println("Person class : Age Validation");
        Person p1 = new Person();
        p1.setAge(-5);
        System.out.println(p1.getAge());
        System.out.println();
        System.out.println("Student marks validation");
        Student7 st1 = new Student7();
        st1.setMarks(101);
        System.out.println(st1.getMarks());
        System.out.println();

        User9 u1 = new User9();
        u1.setPassword("acd@com");
        System.out.println(u1.getPassword());
    }
}

class Students {
    private int id;
    private String name;

    //setter
    public void setId(int id) {
        this.id = id;
    }

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }
}

class Employee {
    private int empId;
    private double salary;

    //setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //getters
    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }
}

class Person {
    private int age;

    //setter
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public int getAge() {
        return age;
    }
}

class Student7 {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks should be between 0 and 100");
        }
    }

    public int getMarks() {
        return marks;
    }
}

class User9 {
    private String password;

    public void setPassword(String password) {
        if (password.length()>=8){
            this.password = password;
        } else {
            System.out.println("Password length must be at least 8 characters.");
        }
    }

    public String getPassword() {
        return password;
    }
}