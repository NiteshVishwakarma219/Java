// prime or composite numbers


import java.util.Scanner;
public class prime_or_composite {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i <= num-1; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is a composite number.");
        }

        sc.close();
    }
}