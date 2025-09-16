/*
 
String Builder -->

String Builder is similar to String Buffer, but it is designed to be faster and more efficient for single-threaded scenarios. It is also mutable, allowing you to modify the contents without creating new objects.

Use StringBuffer only when thread safety is needed; otherwise, prefer StringBuilder for better performance.
 */

// Example
public class $14_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);

        // Append
        sb.append(", World!");
        System.out.println("After Append: " + sb);  // Append ", World!" --> Hello, World!

        // Insert
        sb.insert(5, " Java");
        System.out.println("After Insert: " + sb);  // Insert " Java" at index 5  --> Hello Java, World!

        // Delete
        sb.delete(5, 11);
        System.out.println("After Delete: " + sb);  // Delete " Java" --> Hello, World!

        // Replace
        sb.replace(6, 11, "Builder");
        System.out.println("After Replace: " + sb);  // Replace "World" with "Builder" --> Hello, Builder!

        // reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);  // Reverse the string --> !redliuB ,olleH

        // Capacity
        System.out.println("Capacity: " + sb.capacity());  // Get the current capacity --> 34

        // Length
        System.out.println("Length: " + sb.length());  // Get the current length --> 34

        // character at index
        System.out.println("Character at index 0: " + sb.charAt(0)); // Get the character at index 0 --> H

        // substring
        System.out.println("Substring from index 0 to 5: " + sb.substring(0, 5)); // Get the substring from index 0 to 5 --> Hello

        // index of
        System.out.println("Index of 'Builder': " + sb.indexOf("Builder")); // Get the index of "Builder" --> 6

        // last index of
        System.out.println("Last Index of 'l': " + sb.lastIndexOf("l")); // Get the last index of "l" --> 9

        // replace
        sb.replace(6, 12, "Builder");
        System.out.println("After Replace: " + sb);  // Replace "World" with "Builder" --> Hello, Builder!

        // toString
        System.out.println("String representation: " + sb.toString());  // Get the string representation --> Hello, Builder!

        // clear
        sb.setLength(0);
        System.out.println("After Clear: " + sb);  // Clear the StringBuilder --> (empty)

        // set
        sb.setCharAt(0, 'h');
        System.out.println("After Set: " + sb);  // Set the character at index 0 to 'h' --> hello, Builder!

    }
}
