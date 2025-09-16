// Decimal to Hexadecimal conversion

import java.util.Scanner;

public class decimal_to_hexadecimal{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();   // input decimal number

        // String hexa = Integer.toString(decimal,16);

                       // or
        int ans = 0;
        int base = 1;
        while(decimal > 0){
            int rem = decimal % 16;
            ans = ans + rem * base;
            decimal = decimal / 16;
            base = base * 10;
        }


         
        System.out.println(ans);  // output hexadecimal number

    }
}