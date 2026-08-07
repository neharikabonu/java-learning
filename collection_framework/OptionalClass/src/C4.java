import java.util.Optional;

public class C4 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.of("Java");

    boolean result = opt.isPresent();
    boolean result1 = opt.isEmpty();
    System.out.println(result);
    System.out.println(result1);

    System.out.println(opt.get());
  }
}
