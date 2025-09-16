// Reverse of a given numbers

import java.util.Scanner;

public class reverse_of_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   // input number

        int reverse = 0;
        while(num != 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + reverse);
        sc.close();
    }
}