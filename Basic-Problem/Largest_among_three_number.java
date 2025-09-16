// Largest Number Among Three Numbers

public class Largest_among_three_number {
    public static void main(String[] args)
    {
        int a = 5, b = 10, c = 3, largest;

        // Finding the largest number
        if (a >= b && a >= c)
            largest = a;
        else if (b >= a && b >= c)
            largest = b;
        else
            largest = c;

        // Printing the largest number
        System.out.println(largest + " is the largest number.");
    }
}