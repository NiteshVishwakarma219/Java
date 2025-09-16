/*
 
JAVA -- > java is a high level programming language.
   - It is object-oriented, platform-independent, and has a rich API.
   - Developed by Sun Microsystems in 1995.
   - It is widely used for building enterprise-scale applications.
   - Java is known for its "Write Once, Run Anywhere" capability.
   - It has a large ecosystem of libraries and frameworks.
   - Platform Independence: Java programs can run on any device that has the Java Virtual Machine (JVM) installed.

 */

// java hello world
/* 
public class $1_Basic {
    public static void main(String[] args) {
        System.out.println("Hello, World!");   // for output 
    }
}
*/

// Taking Input in java
/*
 int - sc.nextInt();
 String - sc.nextLine();
 double - sc.nextDouble();
 boolean - sc.nextBoolean();
 */

import java.util.*;

public class $1_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        sc.close();
    }
}
