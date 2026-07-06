package OOPs.Classes_Objects;

public class C3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.model = "ModelX1";
        c1.price = 16_00_000;
        c1.printCarDet();
    }
}

class Car {
    String brand;
    String model;
    int price;

    void printCarDet() {
        System.out.println("Brand: "+brand+"\nModel: "+model+"\nPrice: "+price);
        System.out.println();
    }
}