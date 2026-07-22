public class C18 {
  public static void main(String[] args) {
    Operation add = Operation.ADD;
    System.out.println(add.calculate(5,6));
  }
}

enum Operation {
  ADD {
    @Override
    public int calculate(int a, int b) {
      return a+b;
    }
  },
  SUBTRACT {
    @Override
    public int calculate(int a, int b) {
      return a-b;
    }
  },
  MULTIPLY {
    @Override
    public int calculate(int a, int b) {
      return a*b;
    }
  },
  DIVIDE {
    @Override
    public int calculate(int a, int b) {
      return a/b;
    }
  };

  abstract public int calculate(int a, int b);
}