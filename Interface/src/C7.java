public class C7 {
  public static void main(String[] args) {
      Calculator.add(10,20);
      Calculator.multiply(10, 20);
  }
}

interface Calculator {
  static void add(int a, int b) {
    System.out.println(a+b);
  }

  static void multiply(int a , int b) {
    System.out.println(a * b);
  }
}