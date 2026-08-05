import java.util.function.Function;

public class C15 {
  public static void main(String[] args) {
    Function<Integer, Integer> f = x -> x * x;
    System.out.println(f.apply(12));
  }
}
