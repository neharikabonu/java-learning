import java.util.Scanner;
import java.util.TreeMap;

public class C7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, String> map = new TreeMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    int fromKey = sc.nextInt();
    int toKey = sc.nextInt();

    System.out.println(map.subMap(fromKey, toKey));
  }
}
