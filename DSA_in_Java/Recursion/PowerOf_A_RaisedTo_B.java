package Recursion;

public class PowerOf_A_RaisedTo_B {
    public static void main(String[] args) {

        int a = 2 , b = 5;
        int ans = power2(a , b);
        System.out.println(ans);
    }
    public static int power1(int a , int b){
        if(b == 0) return 1;

        return a * power1(a , b-1);
    }

    public static int power2(int a , int b){
        if(b == 0) return 1;

        int call = power2(a , b / 2);

        if(b % 2 == 0) return call * call;
        else return a * call * call;

    }
}
