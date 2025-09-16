/*

2D Arrays in Java-->

A 2D array is an array of arrays. It is used to store data in a tabular format (rows and columns). Each element in a 2D array is accessed using two indices: one for the row and one for the column.

 */

// Example
public class $11_2DArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array

        int[][] array = new int[3][4]; // 3 rows and 4 columns
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;
             
               // or

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements
        System.out.println("Element at (0, 0): " + matrix[0][0]); // Output: 1
        System.out.println("Element at (1, 2): " + matrix[1][2]); // Output: 6
    }
}



// second way to declare and initialize a 2D array -- by taking input
/*
import java.util.*;
public class $11_2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];

        // Taking input for the 2D array
        System.out.println("Enter elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Displaying the 2D array
        System.out.println("The 2D array is:");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/