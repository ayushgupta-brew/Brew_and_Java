package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;

public class Name_input_array {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // input from user
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

	    for(int  i = 0 ; i< arr.length; i++){
        arr[i] = sc.nextLine();
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
	    sc.close();
    }
}
