// Octal to Decimal Conversion

import java.util.Scanner;

public class octal_to_decimal{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String oct = sc.next();  // input octal

        // int decimal = Integer.parseInt(oct, 8);

                       // or 

        int decimal = 0;
        int base = 1;  // power

        for (int i = oct.length() - 1; i >= 0; i--) {
            int digit = oct.charAt(i) - '0';
            decimal += digit * base;
            base *= 8;  // power
        }

        System.out.println("Decimal value: " + decimal);

        sc.close();
    }
}