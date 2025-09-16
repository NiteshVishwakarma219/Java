// Bubble Sort --> Shift largest elements towards right by compare with adjacent elements
// O(n^2)

import java.util.Scanner;

public class Bubble_sort{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        // input array
        for(int i =0 ; i<5 ; i++){
            arr[i] = sc.nextInt();
        }
 
        for(int i= 0 ;i <5 ; i++){
            for(int j =0 ; j<5-i-1 ;j++){
                if(arr[j] > arr[j+1]){
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

       
        // print sort array
        for(int i =0 ; i<5 ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}