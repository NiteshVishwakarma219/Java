// Hexadecimal to Decimal Conversion

import java.util.Scanner;

public class hexadecimal_to_decimal{
    public static void main(String[] args) {
        
        java.util.Scanner sc = new Scanner(System.in);

        String hexa = sc.next();      // input hexadecimal

        // int decimal = Integer.parseInt(hexa , 16);
        // System.out.println(decimal);

                          // or
        int ans = 0;
        int power = 1;
        for (int i = hexa.length() - 1; i >= 0; i--) {
            char ch = hexa.charAt(i);
            int rem;
            if (ch >= '0' && ch <= '9') {
                rem = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                rem = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                rem = ch - 'a' + 10;
            } else {
                rem = 0; // or handle invalid input
            }
            ans += rem * power;
            power *= 16;
        }
        System.out.println(ans);

        sc.close();
    }
}