// Java program to check Leap-year

// Importing Scanner Class
import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args)
    {
        // Taking input from user using Scanner Class
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        // 1st condition check- It is century leap year
        // 2nd condition check- It is leap year and not century year
        if ((year % 400 == 0)
            || ((year % 4 == 0) && (year % 100 != 0))) {

            // Both conditions true- Print leap year
            System.out.println(year + " : Leap Year");
        } else {
            // Any condition fails- Print Non-leap year
            System.out.println(year + " : Non - Leap Year");
        }

        scn.close();
    }
}