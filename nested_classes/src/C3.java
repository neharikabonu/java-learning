public class C3 {
    public static void main(String[] args) {

    }
}

class Outer{
    static int x = 10;

    static class Inner{
        void show(){
            System.out.println(x);
        }
    }
}