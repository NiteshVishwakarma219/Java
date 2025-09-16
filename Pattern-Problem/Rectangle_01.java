// Solid Rectangle Pattern
/*
 1.                  2.                  3.                 4 .                
 * * * * *             1 2 3 4 5           A B C D              1 3 5 7
 * * * * *             1 2 3 4 5           A B C D              1 3 5 7
 * * * * *             1 2 3 4 5           A B C D              1 3 5 7
 * * * * *             1 2 3 4 5           A B C D              1 3 5 7
*/

// 1.

public class Rectangle_01 {
    public static void main(String[] args) {
        int rows = 4;   // Number of rows
        int cols = 5;   // Number of columns

        for (int i = 1; i <= rows; i++) {  // Outer loop for rows
            for (int j = 1; j <= cols; j++) {  // Inner loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 2 .
// public class Rectangle_01{
//     public static void main(String[] args) {
//         int rows = 4;   // Number of rows
//         int cols = 5;   // Number of columns

//         for (int i = 1; i <= rows; i++) {  // Outer loop for rows
//             for (int j = 1; j <= cols; j++) {  // Inner loop for columns
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 3.
// public class Rectangle_01{
//     public static void main(String[] args) {
//         int rows = 4;   // Number of rows
//         int cols = 4;   // Number of columns

//         for (int i = 1; i <= rows; i++) {  // Outer loop for rows
//             for (int j = 1; j <= cols; j++) {  // Inner loop for columns
//                 System.out.print((char)(j + 64) + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// 4.
// public class Rectangle_01{
//     public static void main(String[] args) {
//         int rows = 4;   // Number of rows
//         int cols = 4;   // Number of columns

//         for (int i = 1; i <= rows; i++) { // Outer loop for rows
//             int num = 1; 
//             for (int j = 1; j <= cols; j++) {  // Inner loop for columns
//                 System.out.print(num + " ");
//                 num += 2;
//             }
//             System.out.println();
//         }
//     }
// }