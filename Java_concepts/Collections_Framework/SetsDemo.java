package Collections_Framework;

// If we want unique values then we use sets . Sets remove the duplicate values

//Generics in Java allow you to write code that works with different data types, while keeping it type-safe (no type errors at runtime).

// we represent generic in this symbol = <>

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();  // instance has default initial capacity (16) and load factor (0.75).

        nums.add(12);
        nums.add(20);
        nums.add(73);
        nums.add(94);
        nums.add(105);

        Iterator<Integer> values = nums.iterator();  // we can use iterator to iterate over the values

        while(values.hasNext())  // hasNext() gives you all value and next() give u one value
            System.out.println(values.next());

//        for (int n : nums){
//            System.out.println(n);
//        }
    }
}
