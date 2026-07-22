public class C4 {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine1 = car.new Engine();
        engine1.display();
    }
}

class Car {
    String model = "BMW";

    class Engine {
        void display() {
            System.out.println(model);
        }
    }
}