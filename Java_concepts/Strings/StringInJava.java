package Strings;

/**
 * String in Java
 * ----------------
 * String is immutable in Java.
 * Once a String object is created, its value cannot be changed.
 * Any modification creates a new String object.
 *
 * Common String Methods:
 * ----------------------
 * length()              -> Returns the number of characters.
 * charAt()              -> Returns the character at a specified index.
 * indexOf()             -> Returns the first occurrence of a character/string.
 * lastIndexOf()         -> Returns the last occurrence of a character/string.
 * substring()           -> Returns a portion of the string.
 * toUpperCase()         -> Converts the string to uppercase.
 * toLowerCase()         -> Converts the string to lowercase.
 * trim()                -> Removes leading and trailing spaces.
 * replace()             -> Replaces all occurrences of a character/string.
 * replaceAll()          -> Replaces text using Regular Expressions (Regex).
 * replaceFirst()        -> Replaces only the first Regex match.
 * contains()            -> Checks whether a string contains another string.
 * equals()              -> Compares two strings (case-sensitive).
 * equalsIgnoreCase()    -> Compares two strings (case-insensitive).
 * compareTo()           -> Lexicographically compares two strings.
 * isEmpty()             -> Checks if the string length is zero.
 * isBlank()             -> Checks if the string is empty or contains only whitespace.
 * startsWith()          -> Checks if the string starts with a prefix.
 * endsWith()            -> Checks if the string ends with a suffix.
 * concat()              -> Concatenates two strings.
 * split()               -> Splits the string into an array.
 * repeat()              -> Repeats the string n times.
 * intern()              -> Returns the canonical representation from String Pool.
 */

public class StringInJava {

    public static void main(String[] args) {

        // String Literal (Stored in String Constant Pool)
        String name = "Hii Ayush";

        // Email used for String operations
        String email = "abc@gmail.com";

        // ==========================================================
        // Basic String Methods
        // ==========================================================

        // Returns total number of characters.
        int length = name.length();

        // Returns character at index 0.
        char firstLetter = name.charAt(0);

        // Returns first occurrence of 'u'.
        int firstIndex = name.indexOf("u");

        // Returns last occurrence of 'h'.
        int lastIndex = name.lastIndexOf("h");

        // Converts to uppercase.
        String upperCase = name.toUpperCase();

        // Converts to lowercase.
        String lowerCase = name.toLowerCase();

        // Removes leading and trailing spaces.
        String trimmed = name.trim();

        // Replaces "Hii" with "Hello".
        String replaced = name.replace("Hii", "Hello");

        // Replaces using Regex.
        String regexReplace = email.replaceAll("[a-z]", "*");

        // Replaces only the first Regex match.
        String firstReplace = email.replaceFirst("[a-z]", "X");

        // ==========================================================
        // Searching Methods
        // ==========================================================

        // Checks whether the string contains "Ayush".
        boolean contains = name.contains("Ayush");

        // Checks if string starts with "Hii".
        boolean startsWith = name.startsWith("Hii");

        // Checks if string ends with "sh".
        boolean endsWith = name.endsWith("sh");

        // ==========================================================
        // Comparison Methods
        // ==========================================================

        // Case-sensitive comparison.
        boolean equals = name.equals("Hii Ayush");

        // Case-insensitive comparison.
        boolean equalsIgnoreCase = name.equalsIgnoreCase("hii ayush");

        // Lexicographical comparison.
        int compare = name.compareTo("Hello");

        // ==========================================================
        // Validation Methods
        // ==========================================================

        // Checks if string length is 0.
        boolean isEmpty = name.isEmpty();

        // Checks if string is empty or only whitespace.
        boolean isBlank = name.isBlank();

        // ==========================================================
        // Substring Methods
        // ==========================================================

        // Username before '@'
        String username = email.substring(0, email.indexOf("@"));

        // Domain including '@'
        String domain = email.substring(email.indexOf("@"));

        // Domain without '@'
        String domainWithoutAt = email.substring(email.indexOf("@") + 1);

        // ==========================================================
        // Other Useful Methods
        // ==========================================================

        // Concatenates another string.
        String fullName = name.concat(" Gupta");

        // Splits string using space.
        String[] words = name.split(" ");

        // Repeats the string twice.
        String repeated = "Java ".repeat(2);

        // Returns canonical String from String Pool.
        String pooled = new String("Java").intern();

        // ==========================================================
        // Printing Results
        // ==========================================================

        System.out.println("========== Basic Methods ==========");
        System.out.println("Original String      : " + name);
        System.out.println("Length               : " + length);
        System.out.println("First Character      : " + firstLetter);
        System.out.println("First Index of 'u'   : " + firstIndex);
        System.out.println("Last Index of 'h'    : " + lastIndex);
        System.out.println("Upper Case           : " + upperCase);
        System.out.println("Lower Case           : " + lowerCase);
        System.out.println("Trimmed              : " + trimmed);
        System.out.println("Replace              : " + replaced);
        System.out.println("Replace All          : " + regexReplace);
        System.out.println("Replace First        : " + firstReplace);

        System.out.println("\n========== Search Methods ==========");
        System.out.println("Contains 'Ayush'     : " + contains);
        System.out.println("Starts With 'Hii'    : " + startsWith);
        System.out.println("Ends With 'sh'       : " + endsWith);

        System.out.println("\n========== Comparison Methods ==========");
        System.out.println("Equals               : " + equals);
        System.out.println("Equals Ignore Case   : " + equalsIgnoreCase);
        System.out.println("Compare To           : " + compare);

        System.out.println("\n========== Validation Methods ==========");
        System.out.println("Is Empty             : " + isEmpty);
        System.out.println("Is Blank             : " + isBlank);

        System.out.println("\n========== Substring Methods ==========");
        System.out.println("Email                : " + email);
        System.out.println("Username             : " + username);
        System.out.println("Domain               : " + domain);
        System.out.println("Domain Without @     : " + domainWithoutAt);

        System.out.println("\n========== Other Methods ==========");
        System.out.println("Concat               : " + fullName);
        System.out.println("Repeated             : " + repeated);
        System.out.println("Intern               : " + pooled);

        System.out.println("\nWords after split():");
        for (String word : words) {
            System.out.println(word);
        }
    }
}