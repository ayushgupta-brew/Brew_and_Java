package Arrays;

import java.util.Scanner;

public class ElementSearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFound = false;

       /* System.out.print("Enter the number for an array ");
        int n = sc.nextInt();*/
        System.out.print("Enter the target value to find in the array ");
        int target = sc.nextInt();

        int[] arr = {1 , 3 , 4 , 9 , 6};

       /* int[] arr = new int[n];

        for (int i=0 ; i < arr.length ; i++){
            System.out.print("Enter the values for array: ");
            arr[i] = sc.nextInt();
        }*/
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                System.out.println("Element found . Happy");
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not in an array! Sorry");
        }
        sc.close();
    }
}
