/*

Variables in Java--

     - Variables are containers that store data in memory.
     - In Java, each variable must be declared with a specific data type.
     - The data type determines the size and type of data that can be stored in the variable.
     
     types of variable--
     1. local variables
     2. instance variables
     3. class variables or static variables

 */

public class $5_Variables {
    public static void main(String[] args) {
        int a = 10;  // Primitive variable - integer
        float b = 5.5f;  // Primitive variable - floating-point
        String c = "Hello";  // Reference variable - String

        System.out.println("Primitive Variable a: " + a);
        System.out.println("Primitive Variable b: " + b);
        System.out.println("Reference Variable c: " + c);
    }
}

/*
 Local variables --> local variables are variables that are declared within a method or block and can only be accessed within that method or block.


 public class $5_Variables {
    public static void main(String[] args) {
        int localVar = 20; // Local variable
        System.out.println("Local Variable: " + localVar);
    }
}

*/

// #########################################################################################################

/*
Instance variables are variables that are declared within a class but outside any method.
  They are associated with an instance of the class and can be accessed by all methods in the class.

public class $5_Variables {
   public int instanceVar = 30; // Instance variable

    public static void main(String[] args) {
        $5_Variables obj = new $5_Variables();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }
}

*/

// #########################################################################################################

/*
Class variables or static variables are variables that are declared with the static keyword within a class.
They are shared among all instances of the class and can be accessed without creating an instance of the class.

public class $5_Variables {
    static int classVar = 40; // Class variable

    public static void main(String[] args) {
        System.out.println("Class Variable: " + classVar);
    }
}

*/
