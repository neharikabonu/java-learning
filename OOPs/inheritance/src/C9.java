package OOPs.inheritance.src;

public class C9 {
    public static void main(String[] args) {

    }
}

class Shape {
    void area() {

    }
}

class Circle extends Shape {
    void area () {
        System.out.println("2*pi*r");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("l*b");
    }
}