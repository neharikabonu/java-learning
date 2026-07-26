import java.util.LinkedHashMap;
import java.util.Scanner;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    int input = sc.nextInt();

    if(map.containsKey(input)) {
      System.out.println(map.get(input));
    } else {
      System.out.println("Key Not Found");
    }

//    System.out.println(map.getOrDefault(input, "Key Not Found"));
  }
}
