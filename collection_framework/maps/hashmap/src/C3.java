import java.util.HashMap;
import java.util.Scanner;

public class C3 {
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
      map.remove(input);
      System.out.println("Removed Successfully");
      System.out.println(map);
    } else {
      System.out.println("Key Not Found");
    }
  }
}
