public class C15 {
  public static void main(String[] args) {
    Labrador labrador = new Labrador();

    Animal15 animal = labrador;
    Dog15 dog = labrador;

    labrador.bark();
    labrador.eat();
  }
}

interface Animal15 {
  void eat();
}

interface Dog15 extends Animal15 {
  void bark();
}

class Labrador implements Dog15 {
  @Override
  public void eat() {
    System.out.println(getClass().getSimpleName() +" is eating");
  }

  @Override
  public void bark() {
    System.out.println(getClass().getSimpleName() +" is barking");
  }

}