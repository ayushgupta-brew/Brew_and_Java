package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesInJava8 {
    public static void main(String[] args) {

        /*
         * Predicate<T>
         *
         * Purpose:
         * - Takes one input of type T
         * - Returns only true or false
         * - Used to check a condition
         *
         * Functional Method:
         * boolean test(T t)
         *
         * Default Methods:
         * - and()    -> combines two conditions, both must be true
         * - or()     -> combines two conditions, at least one must be true
         * - negate() -> reverses the result
         *
         * Common Uses:
         * - Filtering data
         * - Validation
         * - Condition checking
         * - Stream API filter()
         */

        // ---------------------------------------------------
        // Example 1: Check if a number is even
        // ---------------------------------------------------

        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Is 10 even? " + isEven.test(10));   // true
        System.out.println("Is 15 even? " + isEven.test(15));   // false


        // ---------------------------------------------------
        // Example 2: Check if a number is greater than 5
        // ---------------------------------------------------

        Predicate<Integer> greaterThanFive = num -> num > 5;

        System.out.println("Is 8 > 5? " + greaterThanFive.test(8));   // true
        System.out.println("Is 3 > 5? " + greaterThanFive.test(3));   // false


        // ---------------------------------------------------
        // Example 3: Check if String length is greater than 5
        // ---------------------------------------------------

        Predicate<String> lengthGreaterThanFive = str -> str.length() > 5;

        System.out.println("Is 'Ayush' longer than 5? " + lengthGreaterThanFive.test("Ayush"));       // false
        System.out.println("Is 'Rajesh' longer than 5? " + lengthGreaterThanFive.test("Rajesh"));     // true


        // ---------------------------------------------------
        // Example 4: Check if String starts with 'A'
        // ---------------------------------------------------

        Predicate<String> startsWithA = str -> str.startsWith("A");

        System.out.println("Does 'Ayush' start with A? " + startsWithA.test("Ayush"));   // true
        System.out.println("Does 'Rajesh' start with A? " + startsWithA.test("Rajesh")); // false


        // ---------------------------------------------------
        // Example 5: Check list size using Predicate
        // ---------------------------------------------------

        List<String> stringList = Arrays.asList("Ayush", "Rajesh", "Nisha");

        /*
         * Here Predicate takes a List<String>
         * and checks whether the list size is greater than 2
         */
        Predicate<List<String>> sizeGreaterThanTwo = list -> list.size() > 2;

        System.out.println("List size > 2 ? " + sizeGreaterThanTwo.test(stringList)); // true


        // ---------------------------------------------------
        // Example 6: Check if list is empty
        // ---------------------------------------------------

        Predicate<List<String>> isEmpty = list -> list.isEmpty();

        System.out.println("Is list empty? " + isEmpty.test(stringList)); // false


        // ---------------------------------------------------
        // Example 7: Use Predicate with Stream filter()
        // ---------------------------------------------------

        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14, 17, 20);

        /*
         * filter() keeps only the elements that satisfy the predicate
         * Here only even numbers will remain
         */
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .toList();

        System.out.println("Even numbers = " + evenNumbers);


        // ---------------------------------------------------
        // Example 8: Use Predicate with Stream filter() for Strings
        // ---------------------------------------------------

        List<String> names = Arrays.asList("Raj", "Ayush", "Rahul", "Nisha", "Alexander");

        List<String> longNames = names.stream()
                .filter(lengthGreaterThanFive)
                .toList();

        System.out.println("Names with length > 5 = " + longNames);


        // ---------------------------------------------------
        // Predicate chaining with and()
        // Both conditions must be true
        // ---------------------------------------------------

        Predicate<Integer> greaterThan10 = num -> num > 10;
        Predicate<Integer> lessThan20 = num -> num < 20;

        System.out.println("15 between 10 and 20? "
                + greaterThan10.and(lessThan20).test(15));   // true

        System.out.println("25 between 10 and 20? "
                + greaterThan10.and(lessThan20).test(25));   // false


        // ---------------------------------------------------
        // Predicate chaining with or()
        // At least one condition must be true
        // ---------------------------------------------------

        Predicate<Integer> isNegative = num -> num < 0;

        System.out.println("5 is positive or negative? "
                + greaterThanFive.or(isNegative).test(5));   // false, because 5 is not > 5 and not negative

        System.out.println("-5 is positive or negative? "
                + greaterThanFive.or(isNegative).test(-5));  // true, because negative condition is true


        // ---------------------------------------------------
        // negate() reverses the result
        // ---------------------------------------------------

        Predicate<Integer> isOdd = isEven.negate();

        System.out.println("Is 7 odd? " + isOdd.test(7));     // true
        System.out.println("Is 10 odd? " + isOdd.test(10));   // false
    }
}