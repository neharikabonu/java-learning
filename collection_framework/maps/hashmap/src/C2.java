import java.util.HashMap;
import java.util.Scanner;

public class C2 {
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

    System.out.println("Enter a value: ");
    String str = sc.next();

    if(map.containsKey(input)) {
      System.out.println("Key Exists");
    } else {
      System.out.println("Key doesn't exist");
    }

    if(map.containsValue(str)) {
      System.out.println("Value Exists");
    } else {
      System.out.println("Value doesn't exist");
    }
  }
}

