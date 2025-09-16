/*
  Operators in Java-->
     
    Java operators are special symbols that perform operations on variables or values. 

  1. Arithmetic Operators
  2. Relational Operators
  3. Logical Operators
  4. Bitwise Operators
  5. Assignment Operators
  6. Unary Operators
  7. Ternary Operators

 */

/* 1. Arithmetic Operators -->

Arithmetic Operators are used to perform simple arithmetic operations on primitive and non-primitive data types. 

* : Multiplication
/ : Division
% : Modulo
+ : Addition
- : Subtraction

public class $7_Operators{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));  // 15
        System.out.println("Subtraction: " + (a - b));  // 5
        System.out.println("Multiplication: " + (a * b));  // 50
        System.out.println("Division: " + (a / b));  // 2
        System.out.println("Modulus: " + (a % b));  // 0
    }
}

*/

// ###################################################################################################

/*

2. Relational Operators -->

Relational Operators are used to compare two values. They return a boolean result (true or false).

== : Equal to
!= : Not equal to
> : Greater than
< : Less than
>= : Greater than or equal to
<= : Less than or equal to

public class $7_Operators{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Equal to: " + (a == b));  // false
        System.out.println("Not equal to: " + (a != b));  // true
        System.out.println("Greater than: " + (a > b));  // true
        System.out.println("Less than: " + (a < b));  // false
        System.out.println("Greater than or equal to: " + (a >= b));  // true
        System.out.println("Less than or equal to: " + (a <= b));  // false
    }
}

 */

 // ###################################################################################################

/*

3. Logical Operators -->

Logical Operators are used to combine multiple boolean expressions.

&& : Logical AND
|| : Logical OR
!  : Logical NOT

public class $7_Operators{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND: " + (a && b));  // false
        System.out.println("Logical OR: " + (a || b));   // true
        System.out.println("Logical NOT: " + (!a));       // false
    }
}

 */

 // ###################################################################################################

/*

4. Bitwise Operators -->

Bitwise Operators are used to perform operations on individual bits of integer types.

&  : Bitwise AND
|  : Bitwise OR
^  : Bitwise XOR
~  : Bitwise NOT
<< : Left shift
>> : Right shift

public class $7_Operators{
    public static void main(String[] args) {
        int a = 5;  // 0101 binary number
        int b = 3;  // 0011 binary number
        System.out.println("Bitwise AND: " + (a & b));  // 1
        System.out.println("Bitwise OR: " + (a | b));   // 7
        System.out.println("Bitwise XOR: " + (a ^ b));  // 6
        System.out.println("Bitwise NOT: " + (~a));      // -6
        System.out.println("Left shift: " + (a << 1));   // 10
        System.out.println("Right shift: " + (a >> 1));  // 2
    }
}

 */

// ###################################################################################################

/*

5. Assignment Operators -->

Assignment Operators are used to assign values to variables.

=   : Assign
+=  : Add and assign
-=  : Subtract and assign
*=  : Multiply and assign
/=  : Divide and assign
%=  : Modulus and assign

public class $7_Operators{
    public static void main(String[] args) {
        int a = 10;
        a += 5;  // a = a + 5
        System.out.println("Add and assign: " + a);
        a -= 3;  // a = a - 3
        System.out.println("Subtract and assign: " + a);
        a *= 2;  // a = a * 2
        System.out.println("Multiply and assign: " + a);
        a /= 4;  // a = a / 4
        System.out.println("Divide and assign: " + a);
        a %= 5;  // a = a % 5
        System.out.println("Modulus and assign: " + a);
    }
}

 */

// #################################################################################################
/*

6. Unary Operators -->

Unary Operators are used to perform operations on a single operand.

+   : Unary plus
-   : Unary minus
++  : Increment
--  : Decrement

public class $7_Operators{
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Unary plus: " + (+a));  // 10
        System.out.println("Unary minus: " + (-a));  // -10
        System.out.println("Increment: " + (++a));   // 11
        System.out.println("Decrement: " + (--a));   // 10
    }
}

*/

// #################################################################################################
/*

7. Ternary Operator -->

The Ternary Operator is a shorthand for the if-else statement.

? : Ternary operator

public class $7_Operators{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int max = (a > b) ? a : b;
        System.out.println("Max value: " + max);
    }
}

 */
