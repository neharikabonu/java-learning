import java.util.Optional;

public class C7 {
  public static void main(String[] args) {
    Optional<String> name = Optional.of("Java");
    Optional<String> opt = Optional.empty();

    name.ifPresent(System.out::println);
    opt.ifPresent(System.out::println);
  }
}
