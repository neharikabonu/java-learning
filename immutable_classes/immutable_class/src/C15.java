public class C15 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}

final class Rectangle {
    private final double length;
    private final double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return (2 * (length + breadth));
    }
}