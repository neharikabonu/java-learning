public class C19 {
    public static void main(String[] args) {

    int a = 12, b = 18;
    int min = a < b ? a : b;
    int gcd = 1;
    for (int i = 1; i <= min; i++) {
        if (a%i == 0 && b % i == 0) {
            gcd = i;
        }
    }
        System.out.println("GCD: "+gcd);
        int lcm = (a*b) / gcd;
        System.out.println("LCM: "+lcm);
    }
}
