import java.util.function.Supplier;

public class C9 {
  public static void main(String[] args) {
    Supplier<Integer> s = () -> 100;
    System.out.println(s.get());
  }
}
