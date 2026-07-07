package Generics;

import java.util.ArrayList;

/*
 * ===========================================================
 *                  WITH GENERICS
 * ===========================================================
 *
 * Generics were introduced in Java 5 to provide
 * Compile-Time Type Safety.
 *
 * By specifying the type inside <>,
 * we tell the compiler exactly what type of objects
 * this collection is allowed to store.
 *
 * Here:
 *      ArrayList<String>
 *
 * means:
 *      - Only String objects can be added.
 *      - get() always returns a String.
 *      - No explicit type casting is required.
 *      - Invalid types are caught during compilation,
 *        preventing Runtime ClassCastException.
 */

public class WithGenerics {

    static void main(String[] args) {

        /*
         * This ArrayList can store ONLY String objects.
         */
        ArrayList<String> list = new ArrayList<>();

        // Valid: String is allowed.
        list.add("Ayush");

        /*
         * Invalid:
         * The compiler immediately reports an error because
         * Integer is not compatible with String.
         *
         * This is Compile-Time Type Safety.
         */
        // list.add(123);

        list.add("Gupta");

        /*
         * No casting required.
         *
         * Since the compiler already knows that this list
         * stores only Strings, get() automatically returns
         * a String.
         */
        String firstName = list.get(0);
        String lastName = list.get(1);

        System.out.println(firstName + " " + lastName);
    }
}