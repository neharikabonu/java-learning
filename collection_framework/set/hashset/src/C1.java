import java.util.*;

public class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hashSet = new HashSet<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      hashSet.add(sc.nextInt());
    }

    System.out.println(hashSet);

    boolean result = hashSet.add(10);
    System.out.println(result);
  }
}
