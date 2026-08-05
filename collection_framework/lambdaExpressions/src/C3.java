public class C3 {
  public static void main(String[] args) {
    Addition sum = (a,b) -> a + b;
    System.out.println(sum.add(10, 20));
  }
}

@FunctionalInterface
interface Addition {
  int add(int a, int b);
}