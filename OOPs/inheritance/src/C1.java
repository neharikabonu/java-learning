package OOPs.inheritance.src;

public class C1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Neharika", 22, 101, 'A');
        s1.display();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student1 extends Person {
    int rollNo;
    char grade;

    Student1(String name, int age, int rollNo, char grade) {
        super(name, age);
        this.rollNo = rollNo;
        this.grade = grade;
    }

    void display () {
        System.out.println("Roll Number: "+rollNo+"\nName: "+name+"\nAge: "+age+"\nGrade: "+grade);
        System.out.println();
    }
}