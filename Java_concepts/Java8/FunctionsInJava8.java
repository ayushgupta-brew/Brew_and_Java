package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionsInJava8 {
    public static void main(String[] args) {

        /*
         * Function<T, R>
         * - Takes one input of type T
         * - Returns one result of type R
         * - It is used when we want to transform one value into another value
         *
         * Example here:
         * Input  -> String
         * Output -> Integer
         * So this function will return the length of the string
         */
        Function<String, Integer> stringLength = str -> str.length();
        // Same thing can also be written as: String::length

        // apply() is used to execute the function
        System.out.println("Length of Ayush = " + stringLength.apply("Ayush"));

        // List of names
        List<String> names = Arrays.asList("Rajesh", "Nisha", "Rahul");

        /*
         * stream().map(function)
         * - stream() creates a stream of elements
         * - map() applies the function to each element
         * - Here each String is converted into its length (Integer)
         */
        List<Integer> namesLength = names.stream()
                .map(stringLength)
                .toList();

        System.out.println("Lengths of names = " + namesLength);

        // ---------------------------------------------------
        // More examples of Function in Java 8
        // ---------------------------------------------------

        // Example 1: Convert string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("Uppercase = " + toUpperCase.apply("hello"));

        // Example 2: Square a number
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("Square of 5 = " + square.apply(5));

        // Example 3: Add 10 to a number
        Function<Integer, Integer> addTen = num -> num + 10;
        System.out.println("5 + 10 = " + addTen.apply(5));

        // Example 4: Convert integer to string
        Function<Integer, String> intToString = num -> "Value is " + num;
        System.out.println(intToString.apply(100));

        // Example 5: Remove spaces from a sentence
        Function<String, String> removeSpaces = str -> str.replace(" ", "");
        System.out.println(removeSpaces.apply("Java 8 Function Example"));

        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        Function<Integer, Integer> add3 = n -> n + 3;

        // andThen: first multiplyBy2, then add3
        System.out.println(multiplyBy2.andThen(add3).apply(5)); // (5 * 2) + 3 = 13

        // compose: first add3, then multiplyBy2
        System.out.println(multiplyBy2.compose(add3).apply(5)); // (5 + 3) * 2 = 16
    }
}