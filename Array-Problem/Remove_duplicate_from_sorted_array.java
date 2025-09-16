// Remove Duplicate Elements from Sorted Array

import java.util.*;

public class Remove_duplicate_from_sorted_array {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0; // Pointer for the position of unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // Length of array with unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, length)));  // copyof means copy the array from 0 to length

        System.out.println("Length of unique elements: " + length);
    }
}
