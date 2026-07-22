public class C9 {
  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.fly();
    duck.swim();
  }
}

interface Flyable {
  void fly();
}

interface Swimmable {
  void swim();
}

class Duck implements Flyable, Swimmable {
  @Override
  public void fly() {
    System.out.println(getClass().getSimpleName() +" flies");
  }

  @Override
  public void swim() {
    System.out.println(getClass().getSimpleName() +" swims");
  }
}