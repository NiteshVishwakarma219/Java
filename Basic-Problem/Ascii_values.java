// ASCII Values

import java.util.Scanner;

public class Ascii_values{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);   // input

        int ascii = (int) ch;
         System.out.println("Character for ASCII value " + ch + " is '" + ascii + "'");

        // for(char ch = 'a'; ch <= 'z'; ch++) {
        //     int ascii = (int) ch;
        //     System.out.println("ASCII value of '" + ch + "' is " + ascii);
        // }

        // for(char ch = 'A'; ch <= 'Z'; ch++) {
        //     int ascii = (int) ch;
        //     System.out.println("ASCII value of '" + ch + "' is " + ascii);
        // }

        // sc.close();



        // int ascii
        //  Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a character: ");
        // int num = sc.nextInt(); // input

        // char ascii = (char) num;
        // System.out.println("Character for ASCII value " + num + " is '" + ascii + "'");

        sc.close();
    }
}