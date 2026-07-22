public class C25 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student25 s1 = new Student25(101, "Ram");
        Student25 s2 = new Student25(102, "Raj");
        System.out.println(s2.id +", "+s2.name);
        s2 = (Student25) s1.clone();

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);

    }
}

class Student25 implements Cloneable {
    int id;
    String name;

    Student25(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}