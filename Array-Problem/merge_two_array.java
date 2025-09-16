// Merge two array

import java.util.Arrays;

public class merge_two_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        // Create new array of combined length
        int[] merged = new int[arr1.length + arr2.length];

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }



        Arrays.sort(merged);
        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
