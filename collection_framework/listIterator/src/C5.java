import java.util.*;

public class C5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<>();

    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
      list.add(sc.next());
    }


    System.out.println(list);

    ListIterator<String> it = list.listIterator();

    while (it.hasNext()) {
      String value = it.next();
      String upper = value.toUpperCase();
      it.set(upper);
    }

    System.out.println(list);
  }
}
