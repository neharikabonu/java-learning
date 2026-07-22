public class C11 {
  public static void main(String[] args) {

    Robot robot = new Robot();
    Walkable walk = robot;
    Talkable talk = robot;
    Rechargeable recharge = robot;

    walk.walk();
    talk.talk();
    recharge.recharge();
  }
}

interface Walkable {
  void walk();
}

interface Talkable {
  void talk();
}

interface Rechargeable {
  void recharge();
}

class Robot implements Walkable, Talkable, Rechargeable {
  @Override
  public void talk() {
    System.out.println(getClass().getSimpleName() +" is talking");
  }

  @Override
  public void recharge() {
    System.out.println(getClass().getSimpleName() +" is getting recharged");
  }

  @Override
  public void walk() {
    System.out.println(getClass().getSimpleName() +" is walking");
  }
}