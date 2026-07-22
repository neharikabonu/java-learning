public class C4 {
  public static void main(String[] args) {
    Animal4[] animals = {
            new Dog4(),
            new Cat4(),
            new Cow4()
    };

    for (Animal4 animal : animals) {
      animal.sound();
    }
  }
}

interface Animal4 {
  void sound();
}

class Dog4 implements Animal4 {
  @Override
  public void sound() {
    System.out.println(getClass().getSimpleName() +" says: Bark");
  }
}

class Cat4 implements Animal4 {
  @Override
  public void sound() {
    System.out.println(getClass().getSimpleName() +" says: Meow");
  }
}

class Cow4 implements Animal4 {
  @Override
  public void sound() {
    System.out.println(getClass().getSimpleName() +" says: Moo");
  }
}