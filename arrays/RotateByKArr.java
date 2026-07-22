public class RotateByKArr {
  public static void main(String[] args) {
    int k = 2;
    int [] arr1 = {1,2,3,4,5};
    int [] arr2 = new int[arr1.length];
    int j=0;
    for (int i=k; i<arr1.length; i++){
      arr2[j] = arr1[i];
      j++;
    }
    for (int i=0; i<k; i++) {
      arr2[j] = arr1[i];
      j++;
    }
    System.out.println("arr1");
    for (int i=0; i<arr1.length; i++) {
      System.out.print(arr1[i]+" ");
    }
    System.out.println();
    System.out.println("arr2");
    for (int i=0; i<arr2.length; i++) {
      System.out.print(arr2[i]+" ");
    }
  }
}