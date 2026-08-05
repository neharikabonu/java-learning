import java.util.function.Consumer;
import java.util.function.Function;

public class C11 {
  public static void main(String[] args) {
    Function<Integer, Integer> c = x -> x + x;
    System.out.println(c.apply(25));
  }
}
