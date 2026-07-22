public class C2 {
  public static void main(String[] args) {

    //also i want to know if i can write this way, i know i can, but what's the difference between in writing these two ways.
//    Circle circle = new Circle();
    Shape circle = new Circle(5.6);
    System.out.println("Circle: " +circle.area());

    Shape rectangle = new Rectangle(3,4);
    System.out.println("Rectangle: " +rectangle.area());

    Shape square = new Square(3.8);
    System.out.println("Square: " +square.area());
  }
}

interface Shape {
  double area();
}

class Circle implements Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }
  @Override
  public double area() {
    return Math.PI*radius*radius;
  }
}

class Rectangle implements Shape {
  double length;
  double breadth;

  Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public double area() {
    return (length * breadth);
  }
}

class Square implements Shape {
  double side;

  Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return side * side;
  }
}