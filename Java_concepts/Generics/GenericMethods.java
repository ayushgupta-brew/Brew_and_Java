package Generics;

/**
 * Demonstrates generic methods in Java.
 *
 * A generic method declares its own type parameter (<T>), allowing
 * a single method implementation to work with different data types
 * while maintaining compile-time type safety.
 */
public class GenericMethods {

    static void main() {

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Ayush", "Hello", "World"};

        methodWithVoidType(10);
        methodWithVoidType("Hello");

        System.out.println(methodWithTReturnType("String"));

        // Valid because Integer extends Number.
        printArrayWithBoundedGeneric(intArray);

        // Accepts any reference type.
        printArrayWithoutBoundedGeneric(stringArray);

    }

    /**
     * Generic method that accepts a value of any reference type.
     *
     * The compiler infers the type parameter (<T>) from the argument
     * passed during the method call.
     *
     * Examples:
     * methodWithVoidType(10)      -> T becomes Integer
     * methodWithVoidType("Hello") -> T becomes String
     */
    public static <T> void methodWithVoidType(T value) {
        System.out.println(value);
    }

    /**
     * Returns the same value that was passed to the method.
     *
     * The return type is inferred from the argument, allowing the
     * caller to receive the same type without explicit casting.
     *
     * Examples:
     * methodWithTReturnType(5)        -> Integer
     * methodWithTReturnType("Ayush")  -> String
     */
    public static <T> T methodWithTReturnType(T value) {
        return value;
    }

    /**
     * Prints all elements of an array whose element type extends Number.
     *
     * Bounded Generic:
     * Restricts the type parameter to Number and its subclasses
     * (Integer, Double, Float, Long, etc.).
     *
     * This constraint provides compile-time type safety by preventing
     * incompatible types such as String from being passed.
     */
    public static <T extends Number> void printArrayWithBoundedGeneric(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Prints all elements of an array without imposing any type restriction.
     *
     * Since T has no bounds, this method accepts arrays of any
     * reference type (String, Integer, Character, Custom Objects, etc.).
     */
    public static <T> void printArrayWithoutBoundedGeneric(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}