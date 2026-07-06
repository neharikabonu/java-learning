package OOPs.abstraction.src;

public class C3 {
    public static void main(String[] args) {
        Shape cir1 = new Circle(7);
        System.out.println(cir1.calculateArea());

        Shape rect1 = new Rectangle(10, 5);
        System.out.println(rect1.calculateArea());

        Shape tri1 = new Triangle(12, 6);
        System.out.println(tri1.calculateArea());
    }
}

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    @Override
    double calculateArea() {
        return 3.14*radius*radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    double length;
    double height;
    @Override
    double calculateArea() {
        return length * height ;
    }

    Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
}

class Triangle extends Shape {
    double base;
    double height;

    @Override
    double calculateArea() {
        return 0.5*base*height;
    }

    Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }
}