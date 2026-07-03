public class C27 {
    public static void main(String[] args) {
        int n = 8;
        int prev = 0;
        int pres = 1;
        if(n == 1) {
            System.out.println(prev);
            return;
        }
        if (n == 2) {
            System.out.println(pres);
            return;
        }

        for(int i = 3; i <= n; i++) {
            int next = prev + pres;
            prev = pres;
            pres = next;
        }
        System.out.println(pres);
    }
}
