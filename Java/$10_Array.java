/*
Arrays in Java-->

An array is a data structure that can hold multiple values of the same type. It is a collection of elements, each identified by an index or key. Arrays are used to store lists of data, such as a list of numbers or a list of strings.

*/

// Example of array declaration and initialization
public class $10_Array {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};
                    // or
        int[] moreNumbers = new int[5]; // Declare an array of size 5
        moreNumbers[0] = 10; // Assign values to array elements
        moreNumbers[1] = 20;
        moreNumbers[2] = 30;
        moreNumbers[3] = 40;
        moreNumbers[4] = 50;

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);  // Output: 1
        System.out.println("Second element: " + numbers[1]); // Output: 2

        // Reading from moreNumbers array to avoid warning
        System.out.println("First element of moreNumbers: " + moreNumbers[0]);
    }
}


// Taking Input of Array
/*
import java.util.*;
public class $10_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        
        // input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();   // Taking input for each element
        }
        sc.close();

        System.out.println("You entered:");

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);   // Print each element of the array
        }
    }
}
*/ 