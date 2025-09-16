// Swap Two Number

// 1. Method -- > using third variable
class Swap_two_Number {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp;   // third variable

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using third variable
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}


// 2. Method -- > without using third variable
// class Swap_two_Number {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;

//         System.out.println("Before swapping: a = " + a + ", b = " + b);

//         // Swap without using third variable
//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println("After swapping: a = " + a + ", b = " + b);
//     }
// }

// 3. Method -- > using multiplication and division
// class Swap_two_Number {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;

//         System.out.println("Before swapping: a = " + a + ", b = " + b);

//         // Swap using multiplication and division
//         a = a * b;
//         b = a / b;
//         a = a / b;

//         System.out.println("After swapping: a = " + a + ", b = " + b);
//     }
// }

// 4. Method -- > using bitwise XOR
// class Swap_two_Number {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;

//         System.out.println("Before swapping: a = " + a + ", b = " + b);

//         // Swap using bitwise XOR
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         System.out.println("After swapping: a = " + a + ", b = " + b);
//     }
// }