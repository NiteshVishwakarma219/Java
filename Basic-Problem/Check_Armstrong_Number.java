// Check Armstrong Number or not


import java.util.Scanner;

public class Check_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;
        int sum = 0;

        // Count number of digits
        int digits = 0;
        while(original != 0) {
            original /= 10;
            digits++;
        }
        original = num;

        // Armstrong calculation
        while (original > 0) {
            int rem = original % 10;
            sum += Math.pow(rem, digits);
            original /= 10;
        }

        // Check Armstrong
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
