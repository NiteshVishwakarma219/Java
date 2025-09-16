// Combination

import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();

         //int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        int rfact = 1;
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }
        int nrfact = 1;
        for (int i = 1; i <= (n - r); i++) {
            nrfact *= i;
        }
        int nCr = nfact / (rfact * nrfact);
        System.out.println("Combination C(" + n + ", " + r + ") = " + nCr);

        sc.close();
    }
}

       

