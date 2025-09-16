// Missing Number in an Array

// number_sum from 1 -> n   -  arrSum == missing number

public class missing_number {
    public static int findMissing(int[] arr, int n) {
        // Formula for sum of first n natural numbers
        int totalSum = n * (n + 1) / 2;
        
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Here n = 6, missing = 3
        int n = 6;
        System.out.println("Missing number: " + findMissing(arr, n));
    }
}
