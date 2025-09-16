/*

ButterFully 

*             *              spaces = 2(n-i)
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * * 
* *         * *
*             *

 */

public class ButterFully_06{
    public static void main(String[] args) {
        int n = 4;

    // upper half
        for(int i=1 ; i<=n ; i++){
            // stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            // spaces
            int spaces = 2*(n-i);
            for(int j=1 ; j<=spaces ; j++){
                System.out.print("  ");
            }
            // stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    // lower half
        for(int i=n-1 ; i>=1 ; i--){
            // stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            // spaces
            int spaces = 2*(n-i);
            for(int j=1 ; j<=spaces ; j++){
                System.out.print("  ");
            }
            // stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}