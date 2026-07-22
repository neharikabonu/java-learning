public class C15 {
  public static void main(String[] args) {
    Shape value = Shape.CIRCLE;
    value.draw();
  }
}

enum Shape {
  CIRCLE{
    @Override
    public void draw() {
      System.out.println("Drawing Circle");
    }
  },
  SQUARE{
    @Override
    public void draw() {
      System.out.println("Drawing Square");
    }
  },
  RECTANGLE{
    @Override
    public void draw() {
      System.out.println("Drawing Rectangle");
    }
  };

  abstract public void draw();


}
