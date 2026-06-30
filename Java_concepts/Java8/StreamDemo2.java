package Java8;

// streams cannot be reuse

// if we use filter to make it faster we can use nums.ParallelStream()

import java.util.Arrays;
import java.util.List;


public class StreamDemo2 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2 , 3 , 4, 5 , 7);

//        Stream<Integer> s =  nums.stream();
//        Stream<Integer> s1 =  s.filter(n -> n % 2 == 0);
//        Stream<Integer> s2 =  s1.map(n -> n * 2);
//        int result = s2.reduce(0 , Integer::sum);

       int result =  nums.stream()
                .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                                .reduce(0 , Integer::sum);  // identity means initial value


//        s2.forEach(n -> System.out.println(n));

        System.out.println(result);

//      s.forEach(n -> System.out.println(n));  we cannot write again this line as streams cannot be reused .


    }
}
