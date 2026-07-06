package OOPs.inheritance.src;

public class C3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3("BMW", 80, 4);
        c1.display();
    }
}

class Vehicle3 {
    String brand;
    int speed;

    Vehicle3(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Car3 extends Vehicle3 {
    int noOfDoors;

    Car3(String brand, int speed, int noOfDoors) {
        super(brand, speed);
        this.noOfDoors = noOfDoors;
    }

    void display() {
        System.out.println("Brand: "+brand+"\nSpeed: "+speed+"\nNumber of doors: "+noOfDoors);
        System.out.println();
    }
}