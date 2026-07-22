public class C2 {
    public static void main(String[] args) {
        College.Student.printCollege();
    }
}

class College {
    static String collegeName = "ABC College";

    static class Student {
        static void printCollege() {
            System.out.println(collegeName);
        }
    }
}