// Decimal to Binary Conversion

import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        
        // String binaryString = Integer.toBinaryString(decimalNumber);

                           // or
        int ans = 0, power = 1;
        while (decimalNumber > 0) {
            int rem = decimalNumber % 2;
            ans = ans + rem * power;
            power *= 10;
            decimalNumber /= 2;
        }
        System.out.println("Binary representation: " + ans);
        sc.close();
    }
}