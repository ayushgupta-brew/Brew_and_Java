package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        // User Input for array
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number for array: ");

        int n= sc.nextInt();

        int[] arr = new int[n];

        // accepting the array inputs
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the elements for an array in numbers: ");
            arr[i] = sc.nextInt() ;
        }

        // printing the array
        for(int new_arr : arr){
            System.out.println(new_arr);
        }

        String[] name = {"Ayush" , "Nisha" , "Rajesh" , "Vardan"};
        String[] animals = {"lion" , "horse" , "mountain goat" , "elephant"};
        System.out.print(Arrays.toString(name)); // Returns a string representation of the contents of the specified array .
        System.out.println(name[3]+1); // name[0] means the value at index 0 and in array the index starts with 0 "+" means we can concatenate with it  .
        System.out.println(name.length);

        // using loops
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        // using enhance for loop
        for (String s : animals) {
            System.out.println(s);
        }

        sc.close();
    }
}
