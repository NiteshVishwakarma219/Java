/*

String Buffer-->

String Buffer is a mutable sequence of characters. It is similar to String, but unlike String, String Buffer allows you to modify the contents of the string without creating a new object. This makes it more efficient for scenarios where you need to perform many modifications to a string, such as concatenation or insertion.

It is ideal for scenarios with frequent modifications like append, insert, delete, or replace operations.

 */

// examples

public class $13_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);

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
        sb.replace(6, 11, "Buffer");
        System.out.println("After Replace: " + sb);  // Replace "World" with "Buffer" --> Hello, Buffer!

        // reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);  // Reverse the string --> !rettuB ,olleH

        // Capacity
        System.out.println("Capacity: " + sb.capacity());  // Get the current capacity --> 34

        // Length
        System.out.println("Length: " + sb.length());  // Get the current length --> 34
    }
}
