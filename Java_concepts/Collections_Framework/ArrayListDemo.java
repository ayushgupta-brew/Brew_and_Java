package Collections_Framework;

// collection is a class, and we specify the type in <>

// If we want the index we should use List instead of collection

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();  // initial capacity of ten.
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);

        for(int n : nums) {
            System.out.println(n*2);
        }
    }
}
