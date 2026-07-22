public class C18 {
    public static void main(String[] args) {
        Person p1 = new Person() {

            @Override
            void show() {
                System.out.println("Anonymous Person");
            }
        };
        p1.show();
    }
}

class Person {

    void show() {
        System.out.println("Person");
    }
}