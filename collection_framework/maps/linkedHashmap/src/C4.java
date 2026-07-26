import java.util.LinkedHashMap;
import java.util.Scanner;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    System.out.println(map);

    System.out.println("Enter the key to be updated: ");
    int key = sc.nextInt();

    System.out.println("Enter the value to be updated: ");
    String value = sc.next();

    if (map.containsKey(key)) {
      map.replace(key, value);
      System.out.println("Value updated successfully");
    } else {
      System.out.println("Key not found");
    }

    System.out.println(map);
  }
}
