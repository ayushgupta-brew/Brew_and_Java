package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamsDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2 , 4 , 5 , 6 , 7 , 9);  // Arrays.asList() works as arrayList
        int sum = 0;

        // foreach method main logic
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };

        nums.forEach(c);



//        for (int i = 0; i < nums.size() ; i++) {  // normal loop
//            System.out.println(nums.get(i));
//        }

//        nums.forEach(n -> System.out.println(n));   // foreach method  with lambda expression of code line No- 14

//        for(int n : nums){   // enhance loop
//            if (n % 2 == 0){
//                n = n * 2;
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);
    }
}
