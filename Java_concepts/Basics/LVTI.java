package Basics;

// LVTI -> Local Variable Type Inference

// Var keyword is used for local variables only in java . If we use the var keyword we have to assign it

import java.util.Arrays;

public class LVTI {
    public static void main(String[] args) {

        var name= "Ayush";
        System.out.println(name);

        var nums = new int[3];
        System.out.println(Arrays.toString(nums));

        var obj = new LVTI();
    }
}
