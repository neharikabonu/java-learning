import java.util.function.Consumer;

public class C7 {
  public static void main(String[] args) {
    Consumer<Integer> c = x -> System.out.println("Square: " + x * x);
    c.accept(5);
  }
}
