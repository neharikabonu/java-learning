import java.util.*;
//intersection program

public class C8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hashSet1 = new HashSet<>();
    System.out.println("HashSet 1 Size & Elements: ");
    int n1 = sc.nextInt();

    for (int i = 0; i < n1; i++) {
      hashSet1.add(sc.nextInt());
    }

    HashSet<Integer> hashSet2 = new HashSet<>();
    System.out.println("HashSet 2 Size & Elements: ");
    int n2 = sc.nextInt();

    for (int i = 0; i < n2; i++) {
      hashSet2.add(sc.nextInt());
    }

    System.out.println("HashSet1: " + hashSet1);
    System.out.println("HashSet2: " + hashSet2);

    HashSet<Integer> hashSet3 = new HashSet<>(hashSet1);
    hashSet3.retainAll(hashSet2);

    System.out.println(hashSet3);
  }
}
