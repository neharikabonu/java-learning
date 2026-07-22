public class C18 {
  public static void main(String[] args) {
    Dog18 d = new Dog18();
    Animal18 animal = d; //upcasting dog object into animal reference
    Pet pet = d;

    d.eat();;
    d.sound();
    d.play();
  }
}

abstract class Animal18 {
  String name;
  int age;

  public void eat() {
    System.out.println("Animal is eating");
  }

  abstract public void sound();
}

interface Pet {
  void play();
}

class Dog18 extends Animal18 implements Pet {
  @Override
  public void sound() {
    System.out.println("Dog is barking");
  }

  @Override
  public void eat() {
    System.out.println("Dog is eating");
  }

  @Override
  public void play() {
    System.out.println("Dog is playing");
  }
}