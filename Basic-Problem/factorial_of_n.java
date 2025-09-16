// Factorial

import java.util.Scanner;

public class factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();    // input

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

            System.out.println("Factorial of " + i + " is " + fact);   // factorial from 1 to n
        }
        // System.out.println("Factorial of " + n + " is " + fact);    // factorial of n
        sc.close();
    }
}