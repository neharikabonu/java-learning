public class C12 {
  public static void main(String[] args) {
    for (PizzaSize price : PizzaSize.values()) {
      System.out.println(price);
    }
  }
}

enum PizzaSize {
  SMALL(199),
  MEDIUM(299),
  LARGE(399);

  private final int price;

  PizzaSize(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return name() +" : $" +getPrice();
  }
}