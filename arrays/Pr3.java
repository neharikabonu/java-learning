public class Pr3 {
  public static void main(String[] args) {
    int[] arr = {1,2,3,6,4,5};
    //ascending or descending
    boolean asc = true;

    for (int i=0; i<arr.length-1; i++){
      if (arr[i]>arr[i+1]){
        asc = false;
        break;
      }
    }
    if(asc){
      System.out.println("ascending order");
    } else {
      System.out.println("not ascending");
    }
  }
}
