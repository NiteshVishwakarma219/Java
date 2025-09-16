
import java.util.Scanner;

// Java Program to Check if Given Integer is Odd or Even
class Even_or_Odd {

    // Main Driver Method
    public static void main(String[] args)
    {
        // Declaring and initializing integer variable
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int num = sc.nextInt();

        // Checking if number is even or odd number via remainder
        if (num % 2 == 0) {

            // If remainder is zero then this number is even
            System.out.println("Entered Number is Even");
        }else {
            // If remainder is not zero then this number is odd
            System.out.println("Entered Number is Odd");
        }
    }
}