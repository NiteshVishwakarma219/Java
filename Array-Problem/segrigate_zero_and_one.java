// Segregate 0's and 1's in an array
// means -- > all 0's to left and all 1's to right

public class segrigate_zero_and_one {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 0, 0, 1};
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else { 
                // arr[i] == 1 and arr[j] == 0 → swap
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        System.out.print("After segregation: ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
