// Sum of All Elements in an array

public class sum_of_all_elements{
    public static void main(String[] args) {
        
        int arr[] = {3,6,8,2,9};

        int sum  = 0;

        for(int i=0 ; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum); // 26
    }
}