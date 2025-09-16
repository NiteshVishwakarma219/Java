// Fibonacci Series

public class fibonacci{

    public static int fib(int n){
        int a = 0;
        int b = 1;
        int next =0;
        System.out.print(" fibonacci Series : " + a + " ");
        for(int i = 1 ; i<= n ;i++){
            next = a+b;
            a = b;
            b = next;
        System.out.print(a +" ");
        }
        return a;
    }

    public static void main(String[] args) {
        
        int n = 8;
        fib(n);
        

    }
}