public class C4 {
  public static void main(String[] args) {
    Calculator ans = (a, b) -> {
      int sum = a + b;
      return sum;
    };

    System.out.println(ans.calculate(10, 20));
  }
}

@FunctionalInterface
interface Calculator {
  int calculate(int a, int b);
}