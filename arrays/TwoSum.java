public class TwoSum {
  public static void main(String[] args) {
    int[] arr = {6,3,2,5,1,4,7};
    int target = 11;
    for (int i=0; i<arr.length; i++) {
      for (int j=i+1; j<arr.length; j++) {
        if (arr[i]+arr[j]==target) {
          System.out.println("found at ["+i+","+j+"]");
          return;
        }
      }
    }
      System.out.println("no such target found");
  }
}
