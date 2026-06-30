package Basics;

// Wrapper class means Objects

// Auto - Boxing -> means putting a primitive value to Wrapper object

// Auto - Unboxing -> means taking the primitive value from Wrapper object

// In parseInt() method we take a value int radix also that defines base of number system.

public class Wrapper {
    public static void main(String[] args) {

        int num = 4;  // primitive type

//        Integer num1 = new Integer(num); // Wrapper class - new Integer(value:--) this happens automatically behind  the scene

        Integer num1 = num;  // auto - boxing

        int num2 = num1;  // auto - unboxing

        String s = "15";

        int num3 = Integer.parseInt(s) ; // converts String to numbers

        System.out.println(num3 * 2);

    }
}
