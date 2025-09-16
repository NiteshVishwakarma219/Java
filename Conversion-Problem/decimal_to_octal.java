// Decimal to octal Conversion

import java.util.Scanner;

public class decimal_to_octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();

        // Using built-in method
        // String octalString = Integer.toOctalString(decimalNumber);

                        // or

        String octalString = "";
        while (decimalNumber > 0) {
            int rem = decimalNumber % 8;
            octalString = rem + octalString;
            decimalNumber /= 8;
        }

        System.out.println("The octal equivalent is: " + octalString);
        sc.close();
    }
}