public class C12 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(d instanceof Animal);
        System.out.println(a instanceof Object);
    }
}

class Animal {

}

class Dog extends Animal {

}