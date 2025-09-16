// Second largest elements in Array 

public class second_largest_in_array{
    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8,3,11};

        int first = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                Second = first;
                first = num;
            }else if(num > Second && num != first){
                Second = num;
            }
        }

        System.out.println("Second largest Elements : " + Second);
    }
}
