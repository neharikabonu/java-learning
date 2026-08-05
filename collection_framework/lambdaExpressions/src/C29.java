import java.util.function.Function;

public class C29 {
  public static void main(String[] args) {
    Function<String, String> f = String::toUpperCase;
    System.out.println(f.apply("hello java"));
  }
}
