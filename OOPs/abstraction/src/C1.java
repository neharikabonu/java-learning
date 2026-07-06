package OOPs.abstraction.src;

public class C1 {
    public static void main(String[] args) {
        Vehicle1 car1 = new Car("TS09AB1234", "Hyundai");
        Vehicle1 bike1 = new Bike("TS10CD5678", "Honda");

        car1.displayDetails();
        car1.startEngine();
        car1.stopEngine();

        System.out.println();
        bike1.displayDetails();
        bike1.startEngine();
        bike1.stopEngine();


    }
}

abstract class Vehicle1 {
    String vehNo;
    String brand;

    abstract void startEngine();

    abstract void stopEngine();

    Vehicle1(String vehNo, String brand) {
        this.vehNo = vehNo;
        this.brand = brand;
    }

    abstract void displayDetails();
}

class Car extends Vehicle1 {


    void startEngine() {
        System.out.println("Car Engine has started.");
    }

    void stopEngine() {
        System.out.println("Car Engine has stopped.");
    }

    Car(String vehNo, String brand) {
        super(vehNo, brand);
    }

    void displayDetails() {
        System.out.println("Vehicle Number: "+vehNo);
        System.out.println("Brand: "+brand);
        System.out.println();
    }
}

class Bike extends Vehicle1 {
    void startEngine() {
        System.out.println("Bike Engine has started.");
    }

    void stopEngine() {
        System.out.println("Bike Engine has stopped.");
    }

    Bike(String vehNo, String brand) {
        super(vehNo, brand);
    }

    void displayDetails() {
        System.out.println("Vehicle Number: "+vehNo);
        System.out.println("Brand: "+brand);
        System.out.println();
    }
}