//count the number of elements in given array greater than the given number x

public class Pr8 {
  public static void main(String[] args) {
      int[] arr = {1,3,2,1,2,6,5,3,4};
      int num = 2;
      int count = 0;
      for (int i=0; i<arr.length; i++){
        if (arr[i]>num) {
          count++;
        }
      }
      System.out.println(count);
  }
}
