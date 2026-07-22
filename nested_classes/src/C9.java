public class C9 {
    public static void main(String[] args) {
        Outer9.Inner inner = new Outer9().new Inner();
        inner.show();
    }
}

class Outer9 {

    class Inner {

        void show() {
            System.out.println("Inner Class Object Created");
        }
    }
}