public class SecondMaxElement {
  public static void main(String[] args) {
    int[] arr = {4,5,3,4,6,7,6};
    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;
    for (int i=0; i<arr.length; i++){
      if (arr[i]> max){
        max = arr[i];
      }
    }
    //second max
    for (int i=0; i<arr.length; i++){
      if (arr[i]> smax && arr[i]!=max){
        smax = arr[i];
      }
    }
    System.out.print("The second largest element in the array is: "+smax);
  }
}
