// Insertion Sort --> let suppose first elements is sorted , other left is unsorted and compare with every unsorted 

public class Insertion_sort{
    public static void main(String[] args) {
        
        int arr[] = {1,4,7,2,9,8};

        for(int i = 0 ;i < arr.length ; i++){
            int curr = arr[i];
            for(int j = i-1 ; j >= 0 ; j--){
                if(arr[j] > curr){
                    arr[j+1] = arr[j];
                    arr[j] = curr;
                }else{
                    break;
                }
            }
        }

        // print
        for(int i = 0 ;i<arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }
}