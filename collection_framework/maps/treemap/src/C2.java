import java.util.Scanner;
import java.util.TreeMap;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, String> map = new TreeMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    System.out.println(map.firstKey());
    System.out.println(map.lastKey());

    System.out.println(map.firstEntry());
    System.out.println(map.lastEntry());
  }
}
