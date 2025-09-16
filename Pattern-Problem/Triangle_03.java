// Triangle

/*
 1. Half Pyramid or left-aligned triangle        2. Inverted Half Pyramid left              3. Half Pyramid or right-aligned

 *                                                  * * * * *                                               *
 * *                                                * * * *                                               * *
 * * *                                              * * *                                               * * *
 * * * *                                            * *                                               * * * *
 * * * * *                                          *                                               * * * * *

4 . Inverted Half Pyramid or right-aligned       5. Full Pyramid                6. Number Pyramid

 * * * * *                                               *                            1 
   * * * *                                              * *                         1 2 1
     * * *                                             * * *                      1 2 3 2 1
       * *                                            * * * *                   1 2 3 4 3 2 1
         *                                           * * * * *                1 2 3 4 5 4 3 2 1


7. Inverted Full Pyramid

       1 1
     2 1 1 2
   3 2 1 1 2 3
 4 3 2 1 1 2 3 4


*/

// 1. Half Pyramid or left-aligned
// public class Triangle_03 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) { // outer loop
//             for (int j = 1; j <= i; j++) { // inner loop
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// 2. Inverted Half Pyramid
// public class Triangle_03 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i<=n; i++) { // outer loop
//             for (int j = 1; j <= n-i+1; j++) { // inner loop
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// 3. Half Pyramid or right-aligned
// public class Triangle_03 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) { // outer loop
//             for (int j = 1; j <= n-i; j++) { // inner loop
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) { // inner loop
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 4. Inverted Half Pyramid or right-aligned
// public class Triangle_03 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) { // outer loop
//             for (int j = 1; j <= i-1; j++) { // inner loop
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n-i+1; j++) { // inner loop
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 5. Full Pyramid
// public class Triangle_03 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) { // outer loop
//             for (int j = 1; j <= n-i; j++) { // inner loop
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2*i-1; j++) { // inner loop
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 6. Number Pyramid
// public class Triangle_03{
//     public static void main(String[] args) {
//         int n = 4; // rows

//         for (int i = 1; i <= n; i++) {
//             // Spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // Increasing numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             // Decreasing numbers
//             for (int j = i - 1; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// 7.
// public class Triangle_03 {
//     public static void main(String[] args) {
//         int n = 4; // rows

//         for (int i = 1; i <= n; i++) {
//             // Spaces for pyramid
//             for (int s = 1; s <= n - i; s++) {
//                 System.out.print("  "); // double space
//             }
//             // Descending numbers
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }
//             // Ascending numbers
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }
