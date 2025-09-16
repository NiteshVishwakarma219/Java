// Sum of Digits

import java.util.Scanner;

public class sum_of_digit{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();  // input digit

        int sum = 0;
        while(digit != 0){
            int rem = digit % 10;
            sum += rem;
            digit /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}