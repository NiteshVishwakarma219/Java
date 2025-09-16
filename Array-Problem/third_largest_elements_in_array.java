// Third Largest Elements in Array

public class third_largest_elements_in_array{
    public static void main(String[] args) {
        
        int arr[] = {2,4,5,7,8,3};

        int first = Integer.MIN_VALUE;
        int second  = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                third = second;
                second = first;
                first = num;
            } else if(num > second && num != first){
                third = second;
                second = num;
            } else if(num > third && num != second && num != first){
                third = num;
            }
        }
        System.out.println("Third largest Elements : " + third);
    }
}