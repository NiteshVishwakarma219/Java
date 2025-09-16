public class majority_elements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,2,3,3,3};
        int n  = arr.length-1;

        for(int i=0;i<=n;i++){
            int freq=0;
            for(int j=0;j<=n;j++){
                if(arr[j]==arr[i]){
                    freq++;
                }
            }
            if(freq>n/2){
                System.out.print(arr[i] +" ");
            }
        }
    }
}
