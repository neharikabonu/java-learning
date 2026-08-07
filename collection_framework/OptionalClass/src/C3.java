import java.util.Optional;

public class C3 {
  public static void main(String[] args) {
    String name = null;

    Optional<String> opt = Optional.ofNullable(name);

    System.out.println(opt);
  }
}
