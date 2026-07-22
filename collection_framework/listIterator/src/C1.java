import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class C1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    System.out.println("Enter no of elements: ");
    int n = sc.nextInt();
    System.out.println("Enter elements: ");
    int i = 0;
    while (i < n) {
      list.add(sc.nextInt());
      i++;
    }

    System.out.print("Original: ");
    System.out.println(list);

    ListIterator<Integer> it = list.listIterator(list.size());
    System.out.print("Reverse: ");
    while (it.hasPrevious()) {
      System.out.print(it.previous() + " ");
    }

  }
}
