import java.util.HashMap;
import java.util.Scanner;

public class C5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, String> map = new HashMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    for (Integer key : map.keySet()) {
      System.out.println(key + " : " + map.get(key));
    }
  }
}
