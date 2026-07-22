public class Pr6 {
  public static void main(String[] args) {
    int[] marks = {67, 45, 34, 56, 30};
    for (int i=0; i<marks.length; i++){
      if (marks[i]<35){
        System.out.println("roll no "+i +" got less than 35 marks.");
      }
    }
  }
}
