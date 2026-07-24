import java.util.*;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hashSet = new HashSet<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      hashSet.add(sc.nextInt());
    }

    System.out.println(hashSet);

    System.out.println("Enter the element to be found: ");
    int num = sc.nextInt();

    if (hashSet.contains(num)) {
      System.out.println("Element Found");
    } else {
      System.out.println("Element Not Found");
    }
  }
}
