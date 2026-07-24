import java.util.*;

public class C4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> hashSet = new HashSet<>();
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      hashSet.add(sc.nextInt());
    }

    System.out.println(hashSet);

    System.out.println("Unique elements: " +hashSet.size());

    Integer[] arr = {1,2,3,4,5,6,1,3,4,2,2,4,4};
    HashSet<Integer> hashSet1 = new HashSet<>(List.of(arr));
    System.out.println(hashSet1);

    int[] arr1 = {1,3,1,2,4,4,5,5};
    HashSet<Integer> hashSet2 = new HashSet<>();

    for (int num : arr1) {
      hashSet2.add(num);
    }

    System.out.println(hashSet2);
  }
}
