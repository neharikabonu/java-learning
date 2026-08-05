import java.util.function.Consumer;

public class C12 {
  public static void main(String[] args) {
  Consumer<String> consumer = x -> System.out.println(x.toUpperCase());
    consumer.accept("hello java");
  }

}
