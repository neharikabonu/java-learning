import java.util.*;

public class Pr1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }

    //output
    for (int i=0; i<size; i++){
      System.out.print(arr[i]+" ");
    }

    System.out.print("Enter the number you want to find: ");
    int num = sc.nextInt();
    boolean found = false;

    for (int i=0; i<size; i++){
      if (arr[i]==num){
        System.out.println(num+" found at index "+i);
        found = true;
        break;
      } 
    }
    if (!found){
      System.out.println("Number not found");
    }
  }
}