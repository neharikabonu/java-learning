public class Pat12 {
  public static void main(String[] args) {
    char n = 'E';
    for (char i = 'A'; i<= n; i++){
      for (char j= 'A'; j<=i; j++){
        System.out.print(j+" ");
    }
    System.out.println();
  }
}
}