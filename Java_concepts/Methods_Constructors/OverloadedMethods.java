package Methods_Constructors;

import java.util.Scanner;

public class OverloadedMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter two numbers ");
        System.out.print("Enter three numbers ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();

        int result;

       result =  add(a1 , b1 , c1);
        System.out.println(result);
    }
    static int add(int a , int b){
        return a + b;
    }
    static int add(int a , int b , int c){
        return a + b + c;
    }

}
