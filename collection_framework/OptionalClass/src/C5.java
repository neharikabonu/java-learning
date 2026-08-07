import java.util.Optional;

public class C5 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.empty();

    System.out.println(opt.orElse("Unknown"));
  }
}
