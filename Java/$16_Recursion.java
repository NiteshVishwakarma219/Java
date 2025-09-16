/*
 
Recursion -->

Functions that call itself or themselves are called recursive functions.

 */

// example of recursion
public class $16_Recursion {
    public static void greet(int count) {
       if (count == 0) {
           return;
       }
       System.out.println("Hello!");
       greet(count - 1);
    }
    public static void main(String[] args) {
        greet(5); // Change 5 to any number of times you want to print "Hello!"
    }
}