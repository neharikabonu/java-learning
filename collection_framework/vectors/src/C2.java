import java.util.*;

public class C2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vector<Integer> vector = new Vector<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      vector.add(sc.nextInt());
    }

    System.out.println("Size: " + vector.size());
    System.out.println("Capacity: " + vector.capacity());

//    System.out.println(elementAt);

    Iterator<Integer> it = vector.iterator();

    for (int i = 0; i < n; i++) {
      System.out.print(vector.elementAt(i) + " ");
    }
  }
}
