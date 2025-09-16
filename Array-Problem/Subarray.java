// Subarray -- > use st , end in place of i and j

public class Subarray{
    public static void main(String[] args) {
        
        int arr[] = {2,3,5,7,8,1};

        for(int st=0 ; st<arr.length ; st++){
            for(int end=st ; end<arr.length ; end++){
                for(int i=st ; i<=end ; i++){  // use for subarray print
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}