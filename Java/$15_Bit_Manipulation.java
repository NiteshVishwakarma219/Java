/*

Bit Manipulation -->

Bit manipulation is the act of algorithmically manipulating bits or binary digits, which are the most basic form of data in computing and digital communications. It is a low-level operation that can be used to perform tasks more efficiently.

Common bit manipulation operations include:

1. **AND** (`&`): Compares each bit of two numbers and returns a new number with bits set to 1 only where both numbers had 1s.
2. **OR** (`|`): Compares each bit of two numbers and returns a new number with bits set to 1 where either number had a 1.
3. **XOR** (`^`): Compares each bit of two numbers and returns a new number with bits set to 1 where the bits differ.
4. **NOT** (`~`): Inverts all the bits of a number.
5. **Left Shift** (`<<`): Shifts all bits of a number to the left by a certain number of positions, filling in with 0s.
6. **Right Shift** (`>>`): Shifts all bits of a number to the right by a certain number of positions.

Bit manipulation is often used in performance-critical code, such as graphics processing, cryptography, and network programming.

 */

/* Get the bit at a specific position -- Get Bit

 1. Bit Mask = 1 << position
 2. operation = and
 3. result = number & bitMask


public class $15_Bit_Manipulation {
    public static void main(String[] args) {
        int number = 5; // 0101 in binary
        int position = 2;
        int bitmask = 1 << position;
        if ((number & bitmask) != 0) {
            System.out.println("Bit at position " + position + ": 1");
        } else {
            System.out.println("Bit at position " + position + ": 0");
        }
    }
}

*/


/*

Set Bit
1. Bit Mask = 1 << position
2. operation = or
3. result = number | bitMask

public class $15_Bit_Manipulation {
    public static void main(String[] args) {
        int number = 5; // 0101 in binary
        int position = 1;
        int bitmask = 1 << position;
        number = number | bitmask;
        System.out.println("Number after setting bit at position " + position + ": " + number);
    }
}

*/

/*

Clear Bit
1. Bit Mask = 1 << position
2. operation = and
3. result = number & ~bitMask

public class $15_Bit_Manipulation {
    public static void main(String[] args) {
        int number = 5; // 0101 in binary
        int position = 2;
        int bitmask = 1 << position;
        number = number & ~bitmask;
        System.out.println("Number after clearing bit at position " + position + ": " + number);
    }
}

 */


/*

Update Bit
1. Bit Mask = 1 << position
2. operation = xor
3. result = number ^ bitMask

public class $15_Bit_Manipulation {
    public static void main(String[] args) {
        int number = 5; // 0101 in binary
        int position = 1;
        int bitmask = 1 << position;
        number = number ^ bitmask;
        System.out.println("Number after updating bit at position " + position + ": " + number);
    }
}

 */