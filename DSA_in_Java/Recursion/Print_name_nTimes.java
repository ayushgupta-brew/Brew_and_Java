package Recursion;

import java.util.Scanner;

public class Print_name_nTimes {
    public static void main(String[] args) {

        // Scanner for taking command line input of name and number of times to print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println("Enter the number to print n_time the name");
        int num = sc.nextInt();

        // calling the static method with name , count initial as -> 0 and num for the numbers of times to print it
        print_names(name ,0, num);
    }

    // recursive static function for printing name n number of times
    public static void print_names(String name ,int count, int num){

        // base case to stop recursion calls
        if(count == num || num == 0){
            return;
        }
        System.out.print(name + " ");

        //recursive case to print names for the given input numbers with incrementation of count
        print_names(name , count+1, num);
    }
}