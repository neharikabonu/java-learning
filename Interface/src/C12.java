public class C12 {
  public static void main(String[] args) {
    Test test = new Test();
    A a = test;
    B b = test;

    test.display();
  }
}

interface A {
  default void display() {
    System.out.println("A");
  }
}

interface B {
  default void display() {
    System.out.println("B");
  }
}

class Test implements A, B {
  @Override
  public void display() {
    A.super.display();
    B.super.display();
  }
}