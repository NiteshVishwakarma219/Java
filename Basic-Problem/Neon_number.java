// Neon Number or not  -- A neon number is a number where the sum of digits of the square of the number is equal to the number.
               //Explanation : square of 9=9*9=81;
//              sum of digit of square : 8+1=9(which is equal to given number)

// exapmle

public class Neon_number{
    public static void main(String[] args) {

        int num = 9; // example number
        int square = num * num; // square of the number
        int sum = 0;

        // calculate sum of digits of the square
        while (square > 0) {
            int rem = square % 10;
            sum += rem;
            square /= 10;
        }

        // check if the sum is equal to the original number
        if (sum == num) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }
    }
}