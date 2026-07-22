public class C13 {
  public static void main(String[] args) {
    for (Temperature temp : Temperature.values()) {
      System.out.println(temp);
    }
  }
}

enum Temperature {
  HOT{
    public String describe() {
      return "Very Hot";
    }
  },
  COLD{
    public String describe() {
      return "Very Cold";
    }
  },
  NORMAL {
    public String describe() {
      return "Room Temperature";
    }
  };

  abstract public String describe();

  @Override
  public String toString() {
    return name() +" : " +describe();
  }
}