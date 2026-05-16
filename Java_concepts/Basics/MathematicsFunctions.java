package Basics;

public class MathematicsFunctions {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(2 , 3); // 2 here is the number and 3 is the power of it .
        result = Math.abs(-5); // gives the absolute value .
        result = Math.sqrt(9); // gives the square root value .
        result = Math.round(3.15); // its rounds off the value means after decimal it rounds off the values .
        result = Math.ceil(7.13); // to round up the value .
        result = Math.floor(8.13); // to round down the value .
        result = Math.max(10 , 20);
        result = Math.min(10 , 20);

        System.out.println(result);
    }
}
