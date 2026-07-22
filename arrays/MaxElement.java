
import java.util.Scanner;

public class MaxElement {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("input size of the array: ");
      int size = sc.nextInt();
      int[] arr = new int[size];

      //input
      System.out.println("input "+size+" elements: ");
      for (int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
      }

      //output
      System.out.println("your array is :");
      System.out.print("[ ");
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      System.out.print("]");
      System.out.println();

      //maxvalue
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
          max = arr[i];
        }
      }
      System.out.println("max element in the array is: "+max);
  }
}
