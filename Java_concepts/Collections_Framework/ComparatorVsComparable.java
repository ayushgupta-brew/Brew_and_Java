package Collections_Framework;

//Comparable is used when a class wants to define its default sorting order inside itself using compareTo().
//Comparator is used when you want to create custom or multiple sorting ways outside the class using compare().

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// return 1 means swap and return -1 means don't swap

// using comparator we can use our own logic for sorting

// if we don't want to use comparator we can implement Comparable interface.

public class ComparatorVsComparable {
    public static void main(String[] args) {

        Comparator<Integer> com = (Integer i , Integer j) ->{
//            if (i % 10 > j % 10) return 1;
//
//            else return -1;

            return i % 10 > j % 10 ? -1 : 1;
        };

        List<Integer> nums = new ArrayList<>();

        nums.add(24);
        nums.add(91);
        nums.add(52);
        nums.add(45);

        nums.sort(com);

        System.out.println(nums);
    }
}
