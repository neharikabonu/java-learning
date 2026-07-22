public class TwoPointersArr {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = new int[5];
    int j=0;
    for (int i=arr1.length-1; i>=0; i--) {
      arr2[j] = arr1[i];
      j++;
    }
    for (int i=0; i<arr2.length; i++) {
      System.out.print(arr2[i]+" ");
    }
  }
}
