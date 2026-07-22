public class C7 {
    public static void main(String[] args) {
        Outer7 outer = new Outer7();
        Outer7.Inner inner = outer.new Inner();
        inner.display();
    }
}

class Outer7 {

    class Inner {

        void display() {
            System.out.println("Hello");
        }
    }
}