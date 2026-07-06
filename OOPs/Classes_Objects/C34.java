package OOPs.Classes_Objects;

public class C34 {
    public static void main(String[] args) {
        Product[] prod = {
                new Product(102, "Refrigerator", 40000),
                new Product(105, "Laptop", 70000),
                new Product(111, "Car", 1600000),
                new Product(112, "Stove", 20000),
                new Product(132, "Television", 50000)
        };

        Product costly = prod[0];

        for (Product pro : prod) {
            if (pro.price > costly.price) {
                costly = pro;
            }
        }
        costly.displayDetails();
    }
}

class Product {
    int id;
    String name;
    int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Product Details: \nID: "+id+"\nName: "+name+"\nPrice: "+price);
    }
}