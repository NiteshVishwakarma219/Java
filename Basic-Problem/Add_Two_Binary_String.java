// Add two Binary Strings

public class Add_Two_Binary_String {

    // Main driver method
    public static void main(String args[])
    {
        String x = "011011", y = "1010111";

         // converting binary string into integer(decimal number)
        int num1 = Integer.parseInt(x, 2);   // radix:2 = binary

         // converting binary string into integer(decimal number)
        int num2 = Integer.parseInt(y, 2);
       // converting binary string into integer(decimal number)

        // Adding those two decimal numbers and storing in sum
        int sum = num1 + num2;
       
        // Converting that resultant decimal into binary string
        String result = Integer.toBinaryString(sum);
        

        System.out.print(result);
    }
}