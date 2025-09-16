// Selection Sort --> select smallest 'i' compare with rest of the array and swap it with 'i' index
// Time Complexity --> O(n^2)

public class Selection_sort{
    public static void main(String[] args) {
        
        int arr[] = {1,4,8,9,6,5,3,4};   // Array

        for(int i = 0 ; i<arr.length-1 ; i++){
            int smallest = i;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // print sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }
}