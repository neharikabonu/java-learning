public class C22 {
    public static void main(String[] args) {
        Student22 s = new Student22();
        Object obj = new Student22();
        System.out.println(s.getClass());
        System.out.println(s.getClass().getName());

        System.out.println("\nObj: ");
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
    }
}

class Student22 {

}