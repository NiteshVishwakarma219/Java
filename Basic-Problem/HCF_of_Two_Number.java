// HCF of two Numbers

import java.util.Scanner;

public class HCF_of_Two_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = 1;  // default value

        int smaller = (a < b) ? a : b;  // find smaller number

        // check all numbers from 1 to smaller
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i; // update hcf
            }
        }

        System.out.println("HCF (GCD) of " + a + " and " + b + " = " + hcf);
    }
}
