package Generics;

import java.util.ArrayList;
import java.util.List;

/*
 * ==========================================
 * Upper Bounded Wildcard (? extends Number)
 * ==========================================
 *
 * Syntax:
 *      <? extends ParentClass>
 *
 * Meaning:
 *      Accepts ParentClass or any of its subclasses.
 *
 * Examples:
 *      List<Integer>
 *      List<Double>
 *      List<Float>
 *      List<Long>
 *
 * Best Use:
 *      Read data from a collection.
 *
 * Rule:
 *      ✔ Can Read
 *      ❌ Cannot Add (except null)
 */

class Upper_Bounded {

    public void printNumbers(List<? extends Number> list) {

        System.out.println("Upper Bounded Wildcard:");

        // Safe to READ because every element is at least a Number
        for (Number number : list) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Safe to retrieve as Number
        Number first = list.get(0);
        System.out.println("First Element : " + first);

        // NOT ALLOWED
        // Compiler doesn't know whether the list is
        // List<Integer>, List<Double>, List<Float>, etc.

        // list.add(100);      // Compile-time Error
        // list.add(10.5);     // Compile-time Error

        // Only null can be added
        // list.add(null);
    }
}


/*
 * ==========================================
 * Lower Bounded Wildcard (? super Integer)
 * ==========================================
 *
 * Syntax:
 *      <? super ChildClass>
 *
 * Meaning:
 *      Accepts ChildClass or any of its parent classes.
 *
 * Examples:
 *      List<Integer>
 *      List<Number>
 *      List<Object>
 *
 * Best Use:
 *      Write/Add data into a collection.
 *
 * Rule:
 *      ✔ Can Add Integer
 *      ❌ Cannot Read as Integer
 *      ✔ Read only as Object
 */

class Lower_Bounded {

    public void addIntegers(List<? super Integer> list) {

        System.out.println("Lower Bounded Wildcard:");

        // Safe to ADD Integer values
        list.add(10);
        list.add(20);
        list.add(30);

        // Reading is only guaranteed as Object
        Object first = list.getFirst();

        System.out.println("First Element : " + first);

        System.out.print("List Elements : ");

        for (Object obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();

        // NOT ALLOWED

        // Integer value = list.get(0);
        // Compiler Error
        // Because compiler only knows it is Object.
    }
}


public class Upper_Lower_Bounded_Wildcards {

    public static void main(String[] args) {

        /*
         * ===============================
         * Upper Bounded Wildcard Example
         * ===============================
         */

        Upper_Bounded upper = new Upper_Bounded();

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.5);
        doubles.add(3.5);

        upper.printNumbers(integers);
        System.out.println();

        upper.printNumbers(doubles);

        System.out.println("\n=============================\n");

        /*
         * ===============================
         * Lower Bounded Wildcard Example
         * ===============================
         */

        Lower_Bounded lower = new Lower_Bounded();

        // Parent of Integer
        List<Number> numbers = new ArrayList<>();
        numbers.add(100.5);

        // Parent of every class
        List<Object> objects = new ArrayList<>();
        objects.add("Hello");

        lower.addIntegers(numbers);
        System.out.println();

        lower.addIntegers(objects);
    }
}