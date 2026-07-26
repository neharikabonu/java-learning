import java.util.LinkedHashMap;
import java.util.Scanner;

public class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }
    System.out.println(map);
  }
}
