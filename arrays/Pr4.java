
import java.util.Scanner;

public class Pr4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input rows:");
    int rows = sc.nextInt();
    System.out.println("input columns: ");
    int cols = sc.nextInt();
    int[][] arr = new int[rows][cols];

    //input
    for (int i=0; i<rows; i++){
      for (int j=0; j<cols; j++){
        arr[i][j] = sc.nextInt();
      }
    }

    //output
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    System.out.println("input the number to find: ");
    int num = sc.nextInt();
    boolean found = false;
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        if (arr[i][j]==num){
          found = true;
          System.out.println(num+" found at index ["+i+"]["+j+"]");
          break;
        }
      }
    }
    if (!found){
      System.out.println("Number not found");
    }
  }
}
