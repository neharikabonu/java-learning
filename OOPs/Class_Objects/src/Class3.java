//constructor chaining
public class Class3 {
    public static void main(String[] args) {
        Students s1 = new Students(101);
        s1.printDetails();
    }
}

class Students {
    int id;
    String name;
    int age;
    char grade;

    void printDetails() {
        System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\nGrade: " + grade);
    }

    Students() {
        this.id = 101;
    }

    Students(int id) {
        this.id = id;
        this.name = "Unknown";
    }

    Students(int id, String name) {
        this.id = id;
        this.name = name;
        this.age = 0;
    }

    Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = 'X';
    }

    Students(int id, String name, int age, char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}