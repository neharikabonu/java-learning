package OOPs.Classes_Objects;

public class C5 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        m1.brand = "Samsung";
        m1.color = "Blue";
        m1.price = 50000;

        m2.brand = "Samsung";
        m2.color = "Blue";
        m2.price = 50000;

        m3.brand = "Samsung";
        m3.color = "Blue";
        m3.price = 50000;

        m1.printDetails();
        m2.printDetails();
        m3.printDetails();
    }
}

class Mobile {
    String brand;
    String color;
    int price;

    void printDetails() {
        System.out.println("Brand: "+brand+"\nColor: "+color+"Price: "+price);
        System.out.println();
    }
}