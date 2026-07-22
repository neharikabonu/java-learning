public class RotateByK {
  public static int [] reverse(int[] arr, int i, int j) {
    
    while (i<j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    return arr;
  }
  public static void main(String[] args) {
    int k=3;
    int[] arr = {1,2,3,4,5};
    //output
    reverse(arr, 0, arr.length-1);
    reverse(arr, 0, k-1);
    reverse(arr, k, arr.length-1);
    for (int a=0; a<arr.length; a++) {
      System.out.print(arr[a]+" ");
    }
  }
}
