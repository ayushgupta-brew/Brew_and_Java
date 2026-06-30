package Recursion;

public class PowerOf_A_RaisedTo_B {
    public static void main(String[] args) {

        int a = 2 , b = 5;
        int ans = power2(a , b);
        System.out.println(ans);
    }

    // Normal recursion: multiplies 'a' b times -> O(b)
    public static int power1(int a , int b){

        // Base case: any number raised to power 0 is 1
        if(b == 0) return 1;

        return a * power1(a , b-1);
    }

    // Optimized recursion using Divide and Conquer -> O(log b)
    public static int power2(int a , int b){

        // Base case
        if(b == 0) return 1;

        // Recursively calculate a^(b/2)
        int call = power2(a , b / 2);

        // If exponent is even: a^b = (a^(b/2))²
        if(b % 2 == 0) return call * call;

            // If exponent is odd: a^b = a × (a^(b/2))²
        else return a * call * call;

    }
}
