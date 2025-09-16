/*
 
String --> String is a sequence of characters.

String is a data type used in programming to represent text rather than numbers.
It is immutable, meaning once a String object is created, its value cannot be changed.

why immutable?
=> Because Strings are designed to be immutable in order to provide security, performance, and simplicity. When a String is created, it is stored in a special area of memory called the "String pool." If a String is modified, a new String object is created in the pool, leaving the original String unchanged. This behavior helps to prevent accidental changes to String values and allows for efficient memory management.


 ** String Buffer -->
      StringBuffer is a mutable sequence of characters. Unlike String, StringBuffer allows you to modify the contents of the string without creating a new object. This makes it more efficient for scenarios where you need to perform many modifications to a string, such as concatenation or insertion.

** String Builder -->
      StringBuilder is similar to StringBuffer but is not synchronized, making it faster for single-threaded scenarios. It is also a mutable sequence of characters and allows for efficient modifications to the string.


Use StringBuffer only when thread safety is needed; otherwise, prefer StringBuilder for better performance.

*/

// String
    public class $12_String {
        public static void main(String[] args) {
            String str = "Hello, World!";
            System.out.println("Original String: " + str);

            // Attempting to modify the string
            str = str + " How are you?";
            System.out.println("Modified String: " + str);
        }
    }

// String Method
/*

1. length() - Returns the length of the string.
2. charAt(int index) - Returns the character at the specified index.
3. substring(int beginIndex, int endIndex) - Returns a new string that is a substring of the original string.
4. indexOf(String str) - Returns the index of the first occurrence of the specified substring.
5. toLowerCase() - Converts the string to lowercase.
6. toUpperCase() - Converts the string to uppercase.
7. trim() - Removes leading and trailing whitespace.
8. split(String regex) - Splits the string into an array of substrings based on the specified delimiter.
9. replace(CharSequence target, CharSequence replacement) - Replaces occurrences of the target sequence with the replacement sequence.
10. toCharArray() - Converts the string into a character array.
11. equals(Object obj) - Compares the string to the specified object for equality.
12. compareTo(String anotherString) - Compares two strings lexicographically.
13. isEmpty() - Checks if the string is empty.
14. startsWith(String prefix) - Checks if the string starts with the specified prefix.
15. endsWith(String suffix) - Checks if the string ends with the specified suffix.
16. contains(CharSequence sequence) - Checks if the string contains the specified sequence of characters.
17. isBlank() - Checks if the string is empty or contains only whitespace.
18. repeat(int count) - Returns a new string that is a concatenation of this string repeated the specified number of times.
19. format(String format, Object... args) - Returns a formatted string using the specified format string and arguments.
20. valueOf(Object obj) - Returns the string representation of the specified object.
21. isEqual(String str1, String str2) - Compares two strings for equality.
22. isNotEqual(String str1, String str2) - Compares two strings for inequality.
23. isSame(String str1, String str2) - Checks if two strings refer to the same object.
24. isNotSame(String str1, String str2) - Checks if two strings do not refer to the same object.
25. isNull(String str) - Checks if the string is null.
26. isNotNull(String str) - Checks if the string is not null.
27. isEmpty(String str) - Checks if the string is empty.
28. isNotEmpty(String str) - Checks if the string is not empty.
29. isWhitespace(String str) - Checks if the string contains only whitespace characters.
30. isNumeric(String str) - Checks if the string is a valid number.
31. isAlphabetic(String str) - Checks if the string contains only alphabetic characters.
32. isAlphanumeric(String str) - Checks if the string contains only alphanumeric characters.

 */

// Example one - by - one
/*
public class $12_String {
        public static void main(String[] args) {
            String str = "Hello, World!";
        }
    }

1. length()--

    int len = str.length();

2. charAt(int index)--

    char ch = str.charAt(0);

3. substring(int beginIndex, int endIndex)--

    String sub = str.substring(0, 5);

4. indexOf(String str)--

    int index = str.indexOf("World");

5. toLowerCase()--

    String lower = str.toLowerCase();

6. toUpperCase()--

    String upper = str.toUpperCase();

7. trim()--

    String trimmed = str.trim();

8. split(String regex)--

    String[] parts = str.split(", ");

9. replace(CharSequence target, CharSequence replacement)--

    String replaced = str.replace("World", "Java");

10. toCharArray()--

    char[] charArray = str.toCharArray();

11. equals(Object obj)--

    boolean isEqual = str.equals("Hello, World!");

12. compareTo(String anotherString)--

    int comparison = str.compareTo("Hello, World!");

13. isEmpty()--

    boolean isEmpty = str.isEmpty();

14. startsWith(String prefix)--

    boolean startsWith = str.startsWith("Hello");

15. endsWith(String suffix)--

    boolean endsWith = str.endsWith("World!");

16. contains(CharSequence sequence)--

    boolean contains = str.contains("World");

17. isBlank()--

    boolean isBlank = str.isBlank();

18. repeat(int count)--

    String repeated = str.repeat(2);

19. format(String format, Object... args)--

    String formatted = String.format("Message: %s, Count: %d", "Hello", 5);

20. valueOf(Object obj)--

    String stringValue = String.valueOf(100);

21. isEqual(String str1, String str2)--

    boolean isEqual = str.equals("Hello, World!");


22. isNotEqual(String str1, String str2)--

    boolean isNotEqual = !str.equals("Hello, World!");

23. isSame(String str1, String str2)--

    boolean isSame = str == "Hello, World!";

24. isNotSame(String str1, String str2)--

    boolean isNotSame = str != "Hello, World!";

25. isNull(String str)--

    boolean isNull = str == null;

26. isNotNull(String str)--

    boolean isNotNull = str != null;

27. isEmpty(String str)--

    boolean isEmpty = str.isEmpty();

28. isNotEmpty(String str)--

    boolean isNotEmpty = !str.isEmpty();

29. isWhitespace(String str)--

    boolean isWhitespace = str.trim().isEmpty();

30. isNumeric(String str)--

    boolean isNumeric = str.matches("-?\\d+(\\.\\d+)?");

31. isAlphabetic(String str)--

    boolean isAlphabetic = str.matches("[a-zA-Z]+");

32. isAlphanumeric(String str)--

    boolean isAlphanumeric = str.matches("[a-zA-Z0-9]+");

 */