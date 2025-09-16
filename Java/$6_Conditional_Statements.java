/*

Conditional Statements in Java-->

A programming language uses control statements to control the flow of execution of a program based on certain conditions.. 
1. if statement
2. if-else statement
3. if-else-if statement
4. nested if statement
5. switch statement
6. jump - break , continue , return

*/

// if statement
public class $6_Conditional_Statements{
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {  // a>5 condition
            System.out.println("a is greater than 5"); // work 
        }
    }
}

// ################################################################################################

// if-else statement

/* 
public class $6_Conditional_Statements{
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {  // a>5 condition
            System.out.println("a is greater than 5"); // work
        } else {
            System.out.println("a is less than or equal to 5");
        }
    }
}
    
*/

// ################################################################################################

// if-else if statement

/* 
public class $6_Conditional_Statements{
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {  // a>5 condition(11)
            System.out.println("a is greater than 5"); // work
        } else if (a == 5) {  // a==5 condition(2)
            System.out.println("a is equal to 5"); // work
        } else {  // condition not true
            System.out.println("a is less than or equal to 5");  // work
        }
    }
}

*/

// ################################################################################################

// nested if statement
/*

public class $6_Conditional_Statements{
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {  // a>5 condition
            System.out.println("a is greater than 5"); // work
            if (a > 10) {  // a>10 condition
                System.out.println("a is also greater than 10");
            }
        } else {
            System.out.println("a is less than or equal to 5");
        }
    }
}

*/

// ################################################################################################

// switch statement
/*
public class $6_Conditional_Statements{
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("a is not 1, 2, or 3");
        }
    }
}

*/

// ################################################################################################

// jump - continue
/*
public class $6_Conditional_Statements{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // skip the rest of the loop when i is 3
            }
            System.out.println(i);
        }
    }
}

*/

// ################################################################################################
// jump -break
/*
public class $6_Conditional_Statements{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // exit the loop when i is 3
            }
            System.out.println(i);
        }
    }
}

*/

// ################################################################################################
//jump - return
/*
public class $6_Conditional_Statements{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                return;  // exit the method when i is 3
            }
            System.out.println(i);
        }
    }
}

*/