public class C9 {
  public static void main(String[] args) {
    for (Planet planet : Planet.values()) {
      System.out.println(planet);
    }
  }
}

enum Planet {
  EARTH(9.8),
  MOON(1.6),
  MARS(3.7),
  ;

  private final double gravity;

  Planet(double gravity) {
    this.gravity = gravity;
  }

  public double getGravity() {
    return gravity;
  }

  @Override
  public String toString() {
    return name() + " : " + gravity;
  }
}