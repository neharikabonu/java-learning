package methods;

import java.util.Scanner;

public class M1 {

    public static int calcFact(int x) {

        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        int n = sc.nextInt();
        System.out.print("input r: ");
        int r = sc.nextInt();
        if (r > n) {
            System.out.println("Invalid input");
            return;
        }
        int nCr = (calcFact(n)) / (calcFact(r) * (calcFact(n - r)));
        int nPr = (calcFact(n)) / (calcFact(n - r));
        System.out.println("nCr: " + nCr);
        System.out.println("nPr: " + nPr);
    }
}
