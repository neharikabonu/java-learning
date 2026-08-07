import java.util.Optional;

public class C9 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.of("Raj");

    Optional<String> result = opt.filter(x -> x.length() > 3);
    System.out.println(result);
  }
}
