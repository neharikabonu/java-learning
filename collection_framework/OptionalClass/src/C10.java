import java.util.Optional;

public class C10 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.empty();

    String result = opt.orElseThrow(() -> new RuntimeException("Not Found"));
    System.out.println(result);
  }
}
