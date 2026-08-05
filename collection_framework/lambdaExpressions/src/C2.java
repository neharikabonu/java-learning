public class C2 {
  public static void main(String[] args) {
    Square side = x -> System.out.println(x * x);
    side.calculate(5);
  }
}

@FunctionalInterface
interface Square {
  void calculate(int n);
}