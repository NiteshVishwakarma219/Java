/*
 Diamond Pattern

       *       
      * *      
     * * *     
    * * * *    
   * * * * *   
    * * * *    
     * * *     
      * *      
       *       

 */

// Diamond pattern
// public class Diamond_08 {
//     public static void main(String[] args) {
//         int n = 5; // Number of rows for the upper half

//         // Upper half of the diamond
//         for (int i = 1; i <= n; i++) {
//             // Print leading spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // Lower half of the diamond
//         for (int i = n - 1; i >= 1; i--) {
//             // Print leading spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // Print stars
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// 2. hallow Diamond 
public class Diamond_08 {
    public static void main(String[] args) {
        int n = 5; // number of rows for upper half

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*"); // boundary star
                } else {
                    System.out.print(" "); // inside hollow
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
