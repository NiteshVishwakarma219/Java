// Binary to Octal Conversion

// binary -> decimal -> octal

import java.util.Scanner;

public class binary_to_octal{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");

        String binaryString = sc.nextLine();

        // // Convert binary to decimal
        // int decimalValue = Integer.parseInt(binaryString, 2);

        // // Convert decimal to octal
        // String octalString = Integer.toOctalString(decimalValue);


                        // or

        // binary to decimal
        int ans = 0 , power = 1;
        while (binaryString.length() > 0) {
            int rem = binaryString.charAt(binaryString.length() - 1) - '0';
            ans = ans + (rem * power);
            power *= 2;
            binaryString = binaryString.substring(0, binaryString.length() - 1);
        }

        // Convert decimal to octal
        String octalString = "";
        while (ans > 0) {
            int rem = ans % 8;
            octalString = rem + octalString;
            ans /= 8;
        }

        System.out.println("The octal equivalent is: " + octalString);
        sc.close();
    }
}