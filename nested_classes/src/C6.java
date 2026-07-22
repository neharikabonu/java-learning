public class C6 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop.Specifications s1 = l1.new Specifications("Dell", 65000);
        s1.display();
    }
}

class Laptop {
    String brand;
    double price;

    class Specifications {
        Specifications(String brand, double price) {
            Laptop.this.brand = brand;
            Laptop.this.price = price;
        }

        void display() {
            System.out.println("Brand: "+brand);
            System.out.println("Price: "+price);
        }
    }
}