import java.util.HashMap;
import java.util.Scanner;

public class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, String> map = new HashMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    System.out.println(map);

    System.out.println("Enter a key: ");
    int input = sc.nextInt();

    if(map.containsKey(input)) {
      System.out.println(map.get(input));
    }
  }
}
