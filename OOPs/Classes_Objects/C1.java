package OOPs.Classes_Objects;

public class C1 {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.id = 101;
        s1.name = "Neharika";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

class Studentt{
    int id;
    String name;
}