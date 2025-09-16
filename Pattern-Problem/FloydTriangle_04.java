// Floyd's Triangle

/*

 1
 2 3
 4 5 6
 7 8 9 10

*/
public class FloydTriangle_04 {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;  // 
        for (int i = 1; i <= n; i++) { // outer loop
            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

