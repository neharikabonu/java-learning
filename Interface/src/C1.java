public class C1 {
  public static void main(String[] args) {
    Animal a1 = new Dog();
    a1.sound();

    Animal a2 = new Cat();
    a2.sound();
  }
}

interface Animal {
  void sound();
}

class Dog implements Animal {
  @Override
  public void sound() {
    System.out.println(getClass().getName() +" says: Bark");
  }
}

class Cat implements Animal {
  @Override
  public void sound() {
    System.out.println(getClass().getName() +" says: Meow");
  }
}