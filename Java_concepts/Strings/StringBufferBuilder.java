package Strings;

/*
 * StringBuffer vs StringBuilder
 * -----------------------------
 * Both are mutable (modifiable) sequences of characters.
 * Unlike String, they do not create a new object after every modification.
 *
 * StringBuffer
 * ------------
 * -> Thread-safe (methods are synchronized).
 * -> Slightly slower due to synchronization.
 * -> Suitable for multi-threaded applications.
 *
 * StringBuilder
 * -------------
 * -> Not thread-safe.
 * -> Faster than StringBuffer.
 * -> Suitable for single-threaded applications.
 *
 * Capacity:
 * ---------
 * Default Capacity = 16 characters.
 *
 * If initialized with a String:
 * Capacity = String Length + 16
 *
 * If capacity is exceeded:
 * New Capacity = (Old Capacity * 2) + 2
 */

public class StringBufferBuilder {

    public static void main(String[] args) {

        // ==========================================================
        // StringBuffer Example
        // ==========================================================

        /*
         * String Length = 11 ("Ayush Gupta")
         * Capacity = 11 + 16 = 27
         */
        StringBuffer buffer = new StringBuffer("Ayush Gupta");

        // Adds text at the end.
        buffer.append(" Nisha");

        // Appends Unicode character for code point 10024 (✨).
        buffer.appendCodePoint(10024);

        /*
         * Replaces characters from index 5 (inclusive)
         * to the end of the string.
         */
        buffer.replace(5, buffer.length(), "gupta");

        System.out.println("===== StringBuffer =====");
        System.out.println("Content  : " + buffer);
        System.out.println("Length   : " + buffer.length());
        System.out.println("Capacity : " + buffer.capacity());



        // ==========================================================
        // StringBuilder Example
        // ==========================================================

        /*
         * StringBuilder works exactly like StringBuffer,
         * but it is NOT synchronized.
         * Therefore, it provides better performance.
         */

        StringBuilder builder = new StringBuilder("Java");

        // Appends text.
        builder.append(" Programming");

        // Inserts text at a specified index.
        builder.insert(4, " Core");

        // Deletes characters from index 5 to 10 (exclusive).
        builder.delete(5, 10);

        // Replaces characters between index 0 and 4.
        builder.replace(0, 4, "Spring");

        // Reverses the complete string.
        builder.reverse();

        System.out.println("\n===== StringBuilder =====");
        System.out.println("Content  : " + builder);
        System.out.println("Length   : " + builder.length());
        System.out.println("Capacity : " + builder.capacity());
    }
}