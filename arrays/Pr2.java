public class Pr2 {
  public static void main(String[] args) {
    int[] arr = {1,4,2,3,5};
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i=0; i<arr.length; i++){
      if (arr[i]>max){
        max = arr[i];
      } if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("MAX: "+max);
    System.out.println("MIN: "+min);
  }
}
