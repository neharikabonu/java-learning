import java.util.Optional;

public class C6 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.empty();

    System.out.println(opt.orElseGet(() -> "Guest"));
  }
}
