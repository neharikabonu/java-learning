package OOPs.inheritance.src;

public class C8 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("Samsung", 86000, 8, 658);
        s1.display();
    }
}

class Mobile {
    String brand;
    double price;

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}

class SmartPhone extends Mobile {
    int ram;
    int storage;

    SmartPhone(String brand, double price, int ram, int storage) {
        super(brand, price);
        this.ram = ram;
        this.storage = storage;
    }

    void display() {
        System.out.println("Brand: "+brand+"\nPrice: "+price+"\nStorage: "+storage+" GB"+"\nRAM: "+ram+" GB" );
    }
}