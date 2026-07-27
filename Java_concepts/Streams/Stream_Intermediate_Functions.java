package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Intermediate_Functions {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8);

        // 1) filter()
        // Description: Keeps only elements that match a condition.
        // Example: keep only even numbers.
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        
                  // we can use .collect method also to collect the data
//                .collect(Collectors.toList());
        System.out.println("filter() -> " + evenNumbers);

        // 2) map()
        // Description: Transforms each element into another value.
        // Example: square every number.
        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .toList();
        System.out.println("map() -> " + squares);

        // 3) distinct()
        // Description: Removes duplicate elements.
        // Example: remove repeated numbers.
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .toList();
        System.out.println("distinct() -> " + uniqueNumbers);

        // 4) sorted()
        // Description: Sorts elements in natural order by default.
        // Example: sort numbers in ascending order.
        List<Integer> sortedNumbersInAscending = numbers.stream()
                .sorted()
                .toList();
        System.out.println("sortedInAscending() -> " + sortedNumbersInAscending);

        List<Integer> sortedNumbersInDescending = numbers.stream()
                .sorted((a, b) -> (b - a))
                .toList();
        System.out.println("sortedInDescending() -> " + sortedNumbersInDescending);

        // 5) limit()
        // Description: Returns only the first N elements.
        // Example: take first 3 numbers.
        List<Integer> firstThree = numbers.stream()
                .limit(3)
                .toList();
        System.out.println("limit() -> " + firstThree);

        // 6) skip()
        // Description: Skips the first N elements.
        // Example: skip first 3 numbers.
        List<Integer> afterSkippingThree = numbers.stream()
                .skip(3)
                .toList();
        System.out.println("skip() -> " + afterSkippingThree);

        // 7) peek()
        // Description: Used for debugging or logging while the stream is flowing.
        // Example: print each element before collecting.
        List<Integer> peekExample = numbers.stream()
                .peek(num -> System.out.println("peek() saw: " + num))
                .toList();
        System.out.println("peek() -> " + peekExample);

        // 8) flatMap()
        // Description: Converts a stream of collections into one flat stream.
        // Example: merge multiple lists into a single list.
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        List<Integer> flattened = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("flatMap() -> " + flattened);

        // 9) takeWhile()  [Java 9+]
        // Description: Takes elements until the condition becomes false.
        // Example: take numbers while they are less than 5.
        List<Integer> takenWhileLessThanFive = numbers.stream()
                .takeWhile(num -> num < 5)
                .toList();
        System.out.println("takeWhile() -> " + takenWhileLessThanFive);

        // 10) dropWhile()  [Java 9+]
        // Description: Drops elements while the condition is true.
        // Example: drop numbers while they are less than 5.
        List<Integer> droppedWhileLessThanFive = numbers.stream()
                .dropWhile(num -> num < 5)
                .toList();
        System.out.println("dropWhile() -> " + droppedWhileLessThanFive);

        // 11) filter + map combined
        // Description: Stream operations can be chained.
        // Example: get squares of only even numbers.
        List<Integer> evenSquares = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .toList();
        System.out.println("filter + map -> " + evenSquares);
    }
}