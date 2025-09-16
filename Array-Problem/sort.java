// Sort Array using sort()

import java.util.*;

public class sort{
    public static void main(String[] args) {
        
        int arr[] = {2,4,5,7,8,9};

        Arrays.sort(arr);

       for(int i=0 ; i<arr.length ; i++){
         System.out.print(arr[i] + " ");
       }
    }
}