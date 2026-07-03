public class Pat13 {
  public static void main(String[] args) {
    char ch = 'e';
    for (char i = 'a'; i<=ch; i++){
      for (char j = 'a'; j<=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
