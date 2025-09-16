/*
  Hollow Rectangle Pattern

   * * * * *
   *       *
   *       *
   * * * * *
   
 */
public class HollowRectangle_02 {
    public static void main(String[] args) {
        int rows = 4;   // Number of rows
        int cols = 5;   // Number of columns

        for (int i = 1; i <= rows; i++) {  // Outer loop for rows
            for (int j = 1; j <= cols; j++) {  // Inner loop for columns
                // Print '*' for the first and last row, and for the first and last column
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Print space for hollow part
                }
            }
            System.out.println();
        }
    }
}
