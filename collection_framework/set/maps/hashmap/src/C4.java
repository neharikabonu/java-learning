import java.util.HashMap;
import java.util.Scanner;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, String> map = new HashMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    System.out.println(map);

    System.out.println("Enter key to be updated: ");
    int key = sc.nextInt();

    System.out.println("Enter the value to be replaced: ");
    String value = sc.next();

    if(map.containsKey(key)) {
      map.replace(key, value);
      System.out.println("Value updated successfully");
      System.out.println(map);
    } else {
      System.out.println("Key not found");
    }
  }
}
