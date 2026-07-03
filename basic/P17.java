public class P17 {
  public static void main(String[] args) {
    int num = 6;

    String result = (num%3==0 && num%6==0)? "divisible" : "not divisible";
    System.out.println(result);
  }
}