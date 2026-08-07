import java.util.Optional;

public class C8 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.of("java");
    Optional<String> result = opt.map(String::toUpperCase);

    System.out.println(result);
    System.out.println(result.get());
  }
}
