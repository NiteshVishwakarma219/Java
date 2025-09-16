/*

Java Exception Handling -->

Exception handling in Java is an effective mechanism for managing runtime errors to ensure the application's regular flow is maintained. Some Common examples of exceptions include ClassNotFoundException, IOException, SQLException, RemoteException, etc. 

Java provides a robust exception handling framework that allows developers to handle exceptions gracefully using try-catch blocks, ensuring that the program can recover from errors without crashing.

Exceptions can occur due to several reasons, such as:

Invalid user input
Device failure
Loss of network connection
Physical limitations (out-of-disk memory)
Code errors
Out of bound
Null reference
Type mismatch
Opening an unavailable file
Database errors
Arithmetic errors

 */


public class $17_Exception_handling {

    // Method to perform division
    public static int divide(int x, int y) {
        return x / y;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {  // ArithmeticException = Division by zero error , e = exception
            System.out.println("Error: " + e.getMessage());   // e.getMessage() = Division by zero error
        }
    }
}