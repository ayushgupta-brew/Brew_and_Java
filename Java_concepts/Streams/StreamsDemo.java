package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*

STREAMS IN JAVA

A Stream is NOT a data structure.
It is a pipeline for processing data in a functional, readable way.

-----------------------------------------------------

Why to use Streams?

To write cleaner and shorter code

To process collections in a declarative style

To avoid manual loops in many cases

To chain operations like filter, map, sort, and collect

-----------------------------------------------------

Important facts:

A stream does not store data.

A stream is used once only.

A stream does not modify the original collection.

------------------------------------------------------

Stream operations are divided into:

Source -> where the data comes from

Intermediate -> filter, map, sorted, distinct, etc.

Terminal -> forEach, sum, collect, count, reduce, etc.
*/

public class StreamsDemo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println("Imperative approach sum of even numbers: " + imperativeApproach(nums));
        System.out.println("Declarative approach using streams: " + declarativeApproachUsingStreams(nums));

        System.out.println("\n--- Different ways to create streams ---");
        demonstrateStreamCreation();

    }

    /*
     * Imperative style:
     * We manually loop through the array, check each number,
     * and build the result step by step.
     */
    public static int imperativeApproach(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    /*
     * Declarative style using Streams:
     * We describe WHAT we want instead of writing every step manually.
     *
     * Arrays.stream(nums)  -> creates a stream from an int array
     * filter(...)          -> keeps only even numbers
     * sum()                -> terminal operation that adds them
     */
    public static int declarativeApproachUsingStreams(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .sum();
    }

    /*
     * Streams can be created from many sources.
     * Below are the most common ones.
     */
    public static void demonstrateStreamCreation() {
        // 1) Stream from a Collection
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        Stream<Integer> streamFromList = list.stream();
        System.out.println("Stream from List: " + streamFromList.toList());

        // 2) Stream from an array
        int[] numbers = {7, 8, 9};
        IntStream streamFromArray = Arrays.stream(numbers);
        System.out.println("Stream from Array: " + streamFromArray.boxed().toList());

        // 3) Stream from values directly
        Stream<String> streamOfValues = Stream.of("Java", "Streams", "API");
        System.out.println("Stream.of(): " + streamOfValues.toList());

        // 4) Empty stream
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Empty stream size: " + emptyStream.count());

        // 5) Generated stream
        // Stream.generate() creates an infinite stream, so we use limit()
        Stream<Integer> generatedStream = Stream.generate(() -> 1).limit(5);
        System.out.println("Generated stream: " + generatedStream.toList());

        // 6) Iterated stream
        // Stream.iterate() also creates an infinite stream, so we use limit()
        Stream<Integer> iteratedStream = Stream.iterate(1, n -> n + 1).limit(5);
        System.out.println("Iterated stream: " + iteratedStream.toList());
    }
}