// Check if two arrays are equal or not

public class two_array_equal_or_not {
    public static void main(String[] args) {
        
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 6, 5};

        boolean equal = true;

        // Check if lengths are equal
        if (arr1.length != arr2.length) {
            equal = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }

    }
}


// 2 method - using Arrays.equals() method
/*
import java.util.Arrays;
public class two_array_equal_or_not {
    public static void main(String[] args) {
        
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5};

        // Using Arrays.equals() method to check if arrays are equal
        boolean equal = Arrays.equals(arr1, arr2);

        if (equal) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }

    }
}

// if multidensional array
Arrays.deepequal
    */