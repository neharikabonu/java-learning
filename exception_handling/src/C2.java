import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("enter index to find the element: ");
        int idx = sc.nextInt();

        //risky code here
        try {
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
