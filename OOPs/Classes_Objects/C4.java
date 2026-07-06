package OOPs.Classes_Objects;

public class C4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 12;
        r1.breadth = 13;
        System.out.println(r1.getArea(r1.length, r1.breadth));
    }
}

class Rectangle {
    int length;
    int breadth;

    int getArea(int l, int b){
        return 2*l*b;
    }
}