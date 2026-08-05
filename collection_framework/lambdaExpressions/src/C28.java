import java.util.function.Function;

public class C28 {
  public static void main(String[] args) {
    Function<String, Integer> f = String::length;
    System.out.println(f.apply("Hello Java"));
  }
}
