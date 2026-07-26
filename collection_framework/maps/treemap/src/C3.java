import java.util.Scanner;
import java.util.TreeMap;

public class C3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeMap<Integer, String> map = new TreeMap<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.next());
    }

    System.out.println("Enter the value you want for higher key and lower key: ");
    int key = sc.nextInt();
    System.out.println("Higher than " +key+ " : " + map.higherKey(key));
    System.out.println("Lower than " +key+ " : " + map.lowerKey(key));
  }
}
