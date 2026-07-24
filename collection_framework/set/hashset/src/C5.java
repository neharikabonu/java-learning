import java.util.*;

public class C5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hashSet = new HashSet<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      hashSet.add(sc.nextInt());
    }

    System.out.println(hashSet);

    Iterator<Integer> it = hashSet.iterator();
    int count = 0;

    while (it.hasNext()) {
      int num = it.next();
      if (num % 2 == 0) {
        count++;
      }
    }

    System.out.println(count);
  }
}
