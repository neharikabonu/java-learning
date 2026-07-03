public class C26 {
    public static void main(String[] args) {
        int n = 3;
        int prev = 0;
        int pres = 1;

        if (n == 1) {
            System.out.print(prev + " ");
            return;
        }

        if (n == 2) {
            System.out.print(prev + " " + pres);
            return;
        }
        System.out.print(prev + " " + pres+" ");
        for (int i = 3; i<= n; i++) {
            int next = prev + pres;
            System.out.print(next+" ");
            prev = pres;
            pres = next;
        }
    }
}
