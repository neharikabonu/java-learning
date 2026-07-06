package OOPs.Classes_Objects;

public class C11 {
    public static void main(String[] args) {
    Students s1 = new Students(101, "Neharika");
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

class Students {
    int id;
    String name;

    Students() {
        System.out.println("default");
    }

    Students(int id) {
        this.id = id;
    }

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }
}