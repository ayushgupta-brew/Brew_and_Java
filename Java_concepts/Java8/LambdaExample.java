package Java8;

// Lambda expressions work only with Functional Interfaces.

@FunctionalInterface
interface Show {

    // Functional interface contains only one abstract method.
    int add(int i, int j);
}

public class LambdaExample {
    public static void main(String[] args) {

        /*
         * Anonymous Inner Class
         * Creates an object and provides the implementation of add().
         */
        Show obj1 = new Show() {
            @Override
            public int add(int i, int j) {
                return i + j;
            }
        };

        /*
         * Lambda Expression
         *
         * Method: add(int i, int j)
         *
         * (i, j) -> i + j
         *  │ │       │
         *  │ │       └── Method body (returns i + j)
         *  │ └────────── Second parameter
         *  └──────────── First parameter
         *
         * Since there is only one statement,
         * '{}' and 'return' are optional.
         */
        Show show1 = (i, j) -> i + j; // Normal Lambda Expression
        Show show2 = Integer::sum; // Method Reference

        // Calling the lambda implementation
        int result = show1.add(2, 3);

        // Calling the anonymous class implementation
        int result1 = show1.add(5, 4);

        // Printing the results
        System.out.println(result + " " + result1);
    }
}

/*
// With braces
(i, j) -> {
    return i + j;
}

// Without braces (single statement)
(i, j) -> i + j;
*/