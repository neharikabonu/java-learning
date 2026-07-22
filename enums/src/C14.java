public class C14 {
  public static void main(String[] args) {
    for (Animal sound : Animal.values()) {
      System.out.println(sound);
    }
  }
}

enum Animal {
  DOG{
    @Override
    public String sound() {
      return "Bark";
    }
  },
  CAT{
    @Override
    public String sound() {
      return "Meow";
    }
  },
  LION{
    @Override
    public String sound() {
      return "Roar";
    }
  };

  abstract public String sound();

  @Override
  public String toString() {
    return name() +" -> " +sound();
  }
}