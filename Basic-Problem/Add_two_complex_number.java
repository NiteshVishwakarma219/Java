// Add Two Complex Number

import java.util.Scanner;
class Add_two_complex_number {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // first complex number
        System.out.print("Enter real part of first complex: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int i1 = sc.nextInt();

        // second complex number
        System.out.print("Enter real part of second complex: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part: ");
        int i2 = sc.nextInt();

        int real = r1 + r2;
        int imag = i1 + i2;
        System.out.println("Sum = " + real + " + " + imag + "i");

        sc.close();
    }
}