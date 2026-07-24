import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class C6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hashSet = new HashSet<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      hashSet.add(sc.nextInt());
    }

    System.out.println(hashSet);

    Iterator<Integer> it = hashSet.iterator();

    int max = it.next();
    while (it.hasNext()) {
      int num = it.next();
      if (num > max) {
        max = num;
      }
    }

    System.out.println(max);
  }
}
