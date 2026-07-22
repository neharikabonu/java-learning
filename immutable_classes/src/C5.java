public class C5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);

        Rectangle r2 = r1;
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());

        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());

        System.out.println(r2.area());
        System.out.println(r2.perimeter());

        System.out.println(r1 == r2);
    }
}

final class Rectangle {
    private final double length;
    private final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (2 * (length + width));
    }
}