package Generics;

import java.util.ArrayList;

/*
 * ===========================================================
 *                WITHOUT GENERICS
 * ===========================================================
 *
 * Before Java 5, collections did not support Generics.
 * Everything stored inside a collection was treated as Object.
 *
 * Since every class in Java extends Object,
 * an ArrayList could store any type of object.
 *
 * Problem:
 * ----------
 * The compiler cannot verify what type of object is actually
 * stored inside the collection.
 *
 * Therefore, whenever we retrieve an element, we must
 * manually cast it to the expected type.
 *
 * Manual casting is dangerous because:
 * 1. The compiler cannot detect incorrect casts.
 * 2. Errors occur only at Runtime.
 * 3. Runtime errors are much harder to debug.
 *
 * Generics were introduced to solve this exact problem by
 * providing compile-time type safety.
 */

public class WithoutGenerics {

    static void main(String[] args) {

        /*
         * Raw ArrayList
         *
         * Since no Generic type is specified,
         * this list can store objects of ANY type.
         */
        ArrayList list = new ArrayList();

        // Different data types can be inserted.
        list.add("Ayush");     // String
        list.add(123);         // Integer
        list.add(1.2d);        // Double

        /*
         * get() returns Object because the compiler
         * has no idea what the actual stored type is.
         */
        Object o = list.get(0);

        /*
         * Since we know index 0 contains a String,
         * we manually cast Object -> String.
         */
        String s = (String) list.get(0);

        /*
         * Here we make a WRONG assumption.
         *
         * Index 1 actually contains an Integer,
         * but we are trying to cast it into a String.
         *
         * Compiler allows this because it only knows
         * that get() returns Object.
         *
         * The error will occur only during Runtime.
         */
        String i = (String) list.get(1);

        try {

            System.out.println("Object value : " + o);

            System.out.println("String value : " + s);

            // This line is never reached because the
            // previous cast throws an exception.
            System.out.println("Wrong cast   : " + i);

        } catch (Exception e) {

            /*
             * Runtime Output:
             *
             * class java.lang.Integer
             * cannot be cast to
             * class java.lang.String
             *
             * This is called ClassCastException.
             */
            System.out.println("Runtime Error -> " + e);
        }
    }
}