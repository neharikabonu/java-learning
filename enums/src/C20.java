public class C20 {
  public static void main(String[] args) {
    for (GameLevel difficulty : GameLevel.values()) {
      System.out.println(difficulty);
    }
  }
}

enum GameLevel {
  EASY(3),
  MEDIUM(6),
  HARD(10);

  final private int enemyCount;

  GameLevel(int enemyCount) {
    this.enemyCount = enemyCount;
  }

  public int getEnemyCount() {
    return enemyCount;
  }

  @Override
  public String toString() {
    return name() +" : " +getEnemyCount();
  }
}