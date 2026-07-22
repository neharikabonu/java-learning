public class C16 {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            void sound() {
                System.out.println("Meow");
            }
        };
        cat.sound();
    }
}

abstract class Animal {
    abstract void sound();
}