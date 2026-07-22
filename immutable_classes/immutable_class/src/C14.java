public class C14 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X5", 2015);
        System.out.println(car1.getYear());

        Car car2 = car1;
        car2 = car2.withYear(2016);
        System.out.println(car2.getYear());
    }
}

final class Car {
    private final String brand;
    private final String model;
    private final int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car withYear(int year) {
        return new Car(brand, model, year);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

}