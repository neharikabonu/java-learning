public class C19 {
  public static void main(String[] args) {
    Calculator power = Calculator.POWER;
    System.out.println(power.operate(2,3));
  }
}

enum Calculator {
  POWER {
    @Override
    public int operate(int a, int b) {
      return Math.powExact(a,b);
    }
  },
  MOD {
    @Override
    public int operate(int a, int b) {
      return a/b;
    }
  },
  MAX {
    @Override
    public int operate(int a, int b) {
      return Math.max(a, b);
    }
  },
  MIN {
    @Override
    public int operate(int a, int b) {
      return Math.min(a,b);
    }
  };

  abstract public int operate(int a, int b);
}
