import java.util.*;

public class C5 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(40);
    list.add(40);

    System.out.println(list);

    list.set(2, 30);
    System.out.println(list);
  }
}
