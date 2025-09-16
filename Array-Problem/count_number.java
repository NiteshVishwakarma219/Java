// Count Number in an array which is greater than a number 'n'

public class count_number{
    public static void main(String[] args) {
        
        int arr[] = {1,6,8,5,9,28};
    
        int n = 5;
        int count = 0;

        for(int num : arr){
            if(num > n){
                count++;
            }
        }
        System.out.println(count);
    }
}