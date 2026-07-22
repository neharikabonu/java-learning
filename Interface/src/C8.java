public class C8 {
  public static void main(String[] args) {
    Greeting helper = new Helper();
    helper.Telugu();
    helper.Hindi();
  }
}

interface Greeting {
  private void English() {
    System.out.println("Hello");
  }
  default void Telugu() {
    English();
  }

  default void Hindi() {
    English();
  }
}

class Helper implements Greeting {

}