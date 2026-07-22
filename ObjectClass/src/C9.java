public class C9 {
    public static void main(String[] args) {
        Student9 s1 = new Student9(101);
        Student9 s2 = new Student9(101);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

class Student9 {
    int id;

    Student9(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Student9 s = (Student9) obj;

        return this.id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}