package OOPs.abstraction.src;

public class C11 {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Tommy", 3);
        Animal cat1 = new Cat("Kitty", 2);

        dog1.makeSound();
        cat1.makeSound();

        System.out.println();

        Pet pet1 = new Dog("Tommy", 3);
        Pet pet2 = new Cat("Kitty", 2);

        pet1.play();
        pet2.play();
    }
}

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }

    @Override
    public void play() {
        System.out.println(name + " plays with a ball");
    }
}

class Cat extends Animal implements Pet {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows");
    }

    @Override
    public void play() {
        System.out.println(name + " plays with a toy");
    }
}