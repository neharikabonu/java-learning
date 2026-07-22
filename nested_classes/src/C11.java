public class C11 {
    public static void main(String[] args) {
        Outer11 outer = new Outer11();
        outer.display();
    }
}

class Outer11 {

    void display() {
        int num = 10;
        class Inner {
            void show () {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
}