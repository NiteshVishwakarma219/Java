// Binary to Decimal Conversion

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        
        // try {
        //     int decimalValue = Integer.parseInt(binaryString, 2);
        //     System.out.println("Decimal value: " + decimalValue);
        // } catch (NumberFormatException e) {
        //     System.out.println("Invalid binary number.");
        // }

                                // or
        
         int ans = 0, power = 1;
        while (binaryString.length() > 0) {
            int rem = binaryString.charAt(binaryString.length() - 1) - '0';
            ans = ans + (rem * power);
            power *= 2;
            binaryString = binaryString.substring(0, binaryString.length() - 1);
        }

        System.out.println("Decimal value: " + ans);
        sc.close();
    }
}