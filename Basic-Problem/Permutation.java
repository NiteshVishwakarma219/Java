// Permutation

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        // int nPr = factorial(n) / factorial(n - r) * factorial(r);
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
        int nPr = nfact / nrfact * rfact;
        System.out.println("Permutation P(" + n + ", " + r + ") = " + nPr);

        sc.close();
    }
}