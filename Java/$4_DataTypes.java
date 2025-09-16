/*
 
DataTypes--

     - Java has two categories of data types:
       1. Primitive Data Types
       2. Reference Data Types

     - Primitive Data Types:
       - These are the basic data types provided by Java.
       - They are not objects and hold their values directly.
       - There are 8 primitive data types in Java:
         1. int: Integer data type (4 bytes)
         2. float: Floating-point data type (4 bytes)
         3. double: Double-precision floating-point data type (8 bytes)
         4. char: Character data type (2 bytes)
         5. boolean: Boolean data type (1 bit)
         6. byte: Byte data type (1 byte)
         7. short: Short integer data type (2 bytes)
         8. long: Long integer data type (8 bytes)

     - Reference Data Types:
       - These are data types that refer to objects and hold references to their memory locations.
       - They are created using classes and can be used to create complex data structures.
       - Examples include:
         1. Strings
         2. Arrays
         3. User-defined classes

 */

 // Primitive Data Types
@SuppressWarnings("ObsoleteAnnotationSupportedSource")
 public class $4_DataTypes {
     public static void main(String[] args) {
         int a = 10;  // int datatypes
         int b = 20;  // int datatypes
         int sum = a + b;

         float f1 = 5.5f;  // float datatypes
         float f2 = 10.5f; // float datatypes
         float fsum = f1 + f2;

         double d1 = 19.99; // double datatypes
         double d2 = 29.99; // double datatypes
         double dsum = d1 + d2;

         char c1 = 'A';  // char datatypes
         char c2 = 'B';  // char datatypes
         int charSum = c1 + c2;

         boolean bool1 = true;  // boolean datatypes
         boolean bool2 = false; // boolean datatypes
         boolean boolResult = bool1 && bool2;

         byte b1 = 10;  // byte datatypes
         byte b2 = 20;  // byte datatypes
         byte bsum = (byte) (b1 + b2);  

         short s1 = 100;  // short datatypes
         short s2 = 200;  // short datatypes
         short ssum = (short) (s1 + s2);

         long l1 = 1000L;  // long datatypes
         long l2 = 2000L;  // long datatypes
         long lsum = l1 + l2;

         System.out.println("Sum: " + sum);
         System.out.println("Float Sum: " + fsum);
         System.out.println("Double Sum: " + dsum);
         System.out.println("Char Sum: " + charSum);
         System.out.println("Boolean Result: " + boolResult);
         System.out.println("Byte Sum: " + bsum);
         System.out.println("Short Sum: " + ssum);
         System.out.println("Long Sum: " + lsum);
     }
 }

 // reference data types

 /*
 public class $4_DataTypes {
     public static void main(String[] args) {
         String str1 = "Hello";  // String datatypes
         String str2 = "World";  // String datatypes
         String strConcat = str1 + " " + str2;

         int[] numbers = {1, 2, 3, 4, 5};  // Array datatypes
         int arraySum = 0;
         for (int num : numbers) {
             arraySum += num;
         }

         System.out.println("String Concatenation: " + strConcat);
         System.out.println("Array Sum: " + arraySum);
     }
 }
     */