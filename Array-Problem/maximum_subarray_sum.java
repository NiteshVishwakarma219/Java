// Maximum Subarray sumn --> maximum sum of subarray


// 1. Method by Brute force Approach -- 
// public class maximum_subarray_sum {
//     public static void main(String[] args) {
        
//         int arr[] = {2,4,5,7,3,8};

//         int maxSum = Integer.MIN_VALUE;

//         for(int st=0 ; st<arr.length ; st++){
//             int currSum = 0;
//             for(int end=st ; end<arr.length ; end++){
//                 currSum = currSum + arr[end];
//                 maxSum = Integer.max(maxSum, currSum);
//             }
//         }
//         System.out.println(maxSum);

//     }
// }


// 2. Method Kadane's Algorithm -->  Best Method (currSum = 0)

public class maximum_subarray_sum {
    public static void main(String[] args) {
        
        int arr[] = {2,4,5,7,3,8,9};

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0 ; i<arr.length ; i++){
            currSum = currSum + arr[i];
            maxSum = Integer.max(maxSum , currSum);

            if(currSum < 0){
                currSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}
