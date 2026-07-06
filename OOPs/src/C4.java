public class C4 {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes", 1899, "Petrol");
        c1.displayCar();
        c1.displayVehicle();
    }
}

class Vehicle {
    String brand;
    int year;

    void displayVehicle() {
        System.out.println("Vehicle");
    }

    Vehicle(String brand, int year) {
        this.brand = brand;
        if (year >= 1900) {
            this.year = year;
        } else {
            this.year = 1900;
        }
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int year, String fuelType) {
        super(brand, year);
        if (fuelType.equalsIgnoreCase("Petrol")  || fuelType.equalsIgnoreCase("Diesel") || fuelType.equalsIgnoreCase("Electric")) {
            this.fuelType = fuelType;
        } else {
            this.fuelType = "Unknown Fuel Type";
        }
    }

    void displayCar() {
        System.out.println("Brand: "+brand);
        System.out.println("Year: "+year);
        System.out.println("Fuel Type: "+fuelType);
        System.out.println();
    }
}