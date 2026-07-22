import java.util.Scanner;

public class C25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter product quantity: ");
            int prodQty = sc.nextInt();
            if (prodQty < 0) {
                throw new QuantityException("Product quantity cannot be negative");
            }
            System.out.println("Product Quantity: "+prodQty);
        } catch (QuantityException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter Product stock: ");
            int prodStock = sc.nextInt();
            if (prodStock > 100) {
                throw new StockException("Product stock is exceeded");
            }
            System.out.println("Product stock: "+prodStock);
        } catch (StockException e) {
            System.out.println(e.getMessage());
        }

    }
}

class QuantityException extends Exception {
    QuantityException(String message) {
        super(message);
    }
}

class StockException extends Exception {
    StockException(String message) {
        super(message);
    }
}