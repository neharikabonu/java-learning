public class C8 {
    public static void main(String[] args) {

        try {
            System.out.println("Resource opened");
            throw new Exception("Something went wrong!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Resource closed");
        }
    }

}
