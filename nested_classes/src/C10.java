public class C10 {
    public static void main(String[] args) {
        Outer10  outer = new Outer10();
        outer.display();
    }
}

class Outer10 {

    void display() {

        class Inner {

            void show() {
                System.out.println("Local Class");
            }
        }

        Inner inner = new Inner();
        inner.show();
    }
}