public class C15 {
    public static void main(String[] args) {
        Object obj = "Java";
        Object obj1 = 101;
        System.out.println(obj instanceof String);
      System.out.println( obj instanceof Integer);
        System.out.println(obj instanceof Object);
        System.out.println("obj1:" +obj1);
        System.out.println(obj1 instanceof Integer);
        System.out.println(obj1 instanceof Number);
        System.out.println(obj1 instanceof Object);
    }
}

