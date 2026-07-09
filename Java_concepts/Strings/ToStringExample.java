package Strings;

/*
 * Every class in Java automatically inherits the toString() method
 * from the Object class.
 *
 * When we print an object, Java internally calls:
 *      object.toString();
 *
 * If we do not override it, the default implementation prints:
 *      ClassName@HexadecimalHashCode
 *
 * By overriding toString(), we can control how the object is displayed.
 */

// -------------------- Without overriding toString() --------------------
class Laptop1 {
    String name;
    int number;

    // Uses Object class's default toString() method
}

// -------------------- With overriding toString() --------------------
class Laptop2 {
    String name;
    int number;

    // Custom implementation of toString()
    // This method will be called automatically whenever the object is printed.
    @Override
    public String toString() {
        return "Laptop{name='" + name + "', number=" + number + "}";
    }
}

public class ToStringExample {

    public static void main(String[] args) {

        // Creating an object of Laptop1
        Laptop1 l1 = new Laptop1();
        l1.name = "Ayush";
        l1.number = 10;

        // Creating an object of Laptop2
        Laptop2 l2 = new Laptop2();
        l2.name = "Ayush";
        l2.number = 10;

        System.out.println("Without overriding toString():");

        // Internally Java executes:
        // System.out.println(l1.toString());
        //
        // Since Laptop1 does not override toString(),
        // Object class's implementation is used.
        // Output format:
        // ClassName@HexadecimalHashCode
        System.out.println(l1);

        System.out.println();

        System.out.println("After overriding toString():");

        // Internally Java executes:
        // System.out.println(l2.toString());
        //
        // Since Laptop2 overrides toString(),
        // our custom string representation is printed.
        System.out.println(l2);
    }
}