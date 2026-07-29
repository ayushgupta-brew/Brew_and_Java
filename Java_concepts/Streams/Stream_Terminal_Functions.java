package Streams;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Stream_Terminal_Functions {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // 1) forEach()
        // Description: Performs an action for each element in the stream.
        // Example: print every number.
        System.out.print("forEach() -> ");
        numbers.stream().forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 2) collect()
        // Description: Collects stream elements into a List, Set, or Map.
        // Example: collect even numbers into a list.
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("collect() -> " + evenNumbers);

        // 3) count()
        // Description: Returns the total number of elements in the stream.
        // Example: count how many numbers are present.
        long totalCount = numbers.stream().count();
        System.out.println("count() -> " + totalCount);

        // 4) reduce()
        // Description: Combines elements into a single value using an accumulator.
        // Example: sum all numbers.
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("reduce() sum -> " + sum);

        // 5) min()
        // Description: Returns the smallest element based on a comparator.
        // Example: find the minimum number.
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("min() -> " + minNumber.orElse(null));

        // 6) max()
        // Description: Returns the largest element based on a comparator.
        // Example: find the maximum number.
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("max() -> " + maxNumber.orElse(null));

        // 7) anyMatch()
        // Description: Checks whether at least one element matches the condition.
        // Example: check if any number is greater than 6.
        boolean anyGreaterThanSix = numbers.stream()
                .anyMatch(num -> num > 6);
        System.out.println("anyMatch() -> " + anyGreaterThanSix);

        // 8) allMatch()
        // Description: Checks whether all elements match the condition.
        // Example: check if all numbers are positive.
        boolean allPositive = numbers.stream()
                .allMatch(num -> num > 0);
        System.out.println("allMatch() -> " + allPositive);

        // 9) noneMatch()
        // Description: Checks whether no element matches the condition.
        // Example: check if no number is negative.
        boolean noneNegative = numbers.stream()
                .noneMatch(num -> num < 0);
        System.out.println("noneMatch() -> " + noneNegative);

        // 10) findFirst()
        // Description: Returns the first element from the stream.
        // Example: get the first number.
        Optional<Integer> firstNumber = numbers.stream()
                .findFirst();
        System.out.println("findFirst() -> " + firstNumber.orElse(null));

        // 11) findAny()
        // Description: Returns any one element from the stream.
        // Example: get any number from the stream.
        Optional<Integer> anyNumber = numbers.stream()
                .findAny();
        System.out.println("findAny() -> " + anyNumber.orElse(null));

        // 12) toArray()
        // Description: Converts stream elements into an array.
        // Example: convert stream to Integer array.
        Object[] numberArray = numbers.stream().toArray();
        System.out.println("toArray() -> " + Arrays.toString(numberArray));

        // 13) Example with filter + terminal operation
        // Description: Intermediate operations are executed only when a terminal operation is called.
        // Example: print even numbers using forEach().
        System.out.print("filter + forEach() -> ");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
