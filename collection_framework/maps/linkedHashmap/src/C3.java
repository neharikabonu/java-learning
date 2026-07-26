import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class C3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
