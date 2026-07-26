import java.util.*;

public class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Integer> linkedHashSet = new LinkedHashSet<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      linkedHashSet.add(sc.nextInt());
    }

    System.out.println(linkedHashSet);

    System.out.println("Enter the element to be removed: ");
    int num = sc.nextInt();

    linkedHashSet.remove(num);
    System.out.println(linkedHashSet);


  }
}
