public class C19 {
  public static void main(String[] args) {
    Car car = new Car();

//    Vehicle vehicle = car;
//    GPS19 gps = car;
//    MusicSystem19 music = car;

    car.Brand();
    car.Model();
    car.fuelType();
    car.location();
    car.play();
    car.stop();
  }
}

abstract class Vehicle {
  public void Brand() {
    System.out.println("Brand");
  }

  public void Model() {
    System.out.println("Model");
  }

  abstract public void fuelType();
}

interface GPS19 {
  void location();
}

interface MusicSystem19 {
  void play();
  void stop();
}

class Car extends Vehicle implements GPS19, MusicSystem19 {
  @Override
  public void fuelType() {
    System.out.println("Diesel");
  }

  @Override
  public void location() {
    System.out.println("Location turned on");
  }

  @Override
  public void play() {
    System.out.println("Music is playing");
  }

  @Override
  public void stop() {
    System.out.println("Music has stopped playing");
  }
}