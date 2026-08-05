import java.util.function.Supplier;

public class C13 {
  public static void main(String[] args) {
    Supplier<String> s = () -> "Java is fun!";
    System.out.println(s.get());
  }
}
