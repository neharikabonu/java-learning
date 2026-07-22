public class C16 {
  public static void main(String[] args) {
    for (Coffee coffee : Coffee.values()) {
      System.out.println(coffee.getPrice());
    }
  }
}

enum Coffee {
  SMALL(50),
  MEDIUM(100),
  LARGE(150);

  private final double price;

  Coffee(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }
}