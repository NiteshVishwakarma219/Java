/*

Loops in Java-->

Java provides several control flow statements to handle looping.

1. For Loop
2. While Loop
3. Do-While Loop

 */

// 1.  for loop
public class $8_Loops{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop iteration: " + i);  // 0 1 2 3 4
        }
    }
}

// ################################################################################################

/*
 2. While Loop

public class $8_Loops{
    public static void main(String[] args) {
        int i = 0;    // initialization
        while (i < 5) {   // condition
            System.out.println("While Loop iteration: " + i);  // 0 1 2 3 4
            i++;
        }
    }
}
*/

// ################################################################################################

/*
 3. Do-While Loop
public class $8_Loops{
    public static void main(String[] args) {
        int i = 0;   // initialization
        do {
            System.out.println("Do-While Loop iteration: " + i);  // 0 1 2 3 4
            i++;   // increment
        } while (i < 5);  // condition
    }
}
*/
