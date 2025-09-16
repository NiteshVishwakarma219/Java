// Check that value is present in array or not by linear search method
// time complexity: O(n)
// space complexity: O(1)

public class value_is_present_in_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int valueToFind = 3;
        boolean isPresent = false;

        for (int num : arr) {
            if (num == valueToFind) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println(valueToFind + " is present in the array.");
        } else {
            System.out.println(valueToFind + " is not present in the array.");
        }
    }
}