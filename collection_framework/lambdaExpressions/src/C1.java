public class C1 {
  public static void main(String[] args) {
    Message a = () -> System.out.println("Hello, Lambda!");

    a.show();
  }
}

@FunctionalInterface
interface Message {
  void show();
}