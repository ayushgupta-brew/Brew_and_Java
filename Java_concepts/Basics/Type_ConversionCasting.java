package Basics;

/*
 1. if we explicitly convert the type as an example if we convert integer to byte, and we have the range out  of 127 then it performs modulus % operator on it .

 2. like int a = 257 ,  byte b = (byte) a -> here 257 is out of range then it will perform modulus
    operation and give the value 1 . 257 % 256 = 1 (answer)
*/

public class Type_ConversionCasting {
    public static void main(String[] args) {
        // type conversion and casting

        byte b = 127; // range of byte is -127 to 127 .

        int a = b;  // implicit type casting

        int c= 12;
        byte k = (byte) c;  // explicit type casting

        int d = 'A';          // Implicit type casting automatically converting char to int .
        // Char c = 34;          // Error: incompatible types: int cannot be converted to char , because char is smaller than int .

        // promotion in expression
        int x = 10;
        double y = 20.3;
        char z = 'a';
        float f = 20.67f;
        long l = 1234567890;
        short s = 1234;
        byte by = 127;


        System.out.println("Promotion in expression : " + (x + y + z + f + l + s + by));
        System.out.println(b);
        System.out.println(a);
        System.out.println(k);
        System.out.println(d);

    }
}
