
import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    //taking input from the user.
    System.out.println("input "+size+" array elements: ");
    for (int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    //output
    System.out.println("your array is: ");
    System.out.print("[ ");
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.print("]");
    System.out.println();

    //LinearSearch logic starts here
    System.out.print("input the element you want to find: ");
    int find = sc.nextInt();
    boolean found = false;
    for (int i=0; i<arr.length; i++) {
      if (arr[i] == find) {
        System.out.print(find +" found at index "+i);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("element not found");
    }
  }
}
