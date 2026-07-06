package OOPs.Classes_Objects;

public class C30 {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        new Stud();
        new Stud();
        new Stud();

        System.out.println("Number of objects created are: "+Stud.count);
    }
}
class Stud {
    static int count = 0;

    Stud() {
        count++;
    }
}