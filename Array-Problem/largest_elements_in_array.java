// Largest element in array
public class largest_elements_in_array {

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 3, 12, 45, 7, 4, 3, 2};

        
       int largest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
