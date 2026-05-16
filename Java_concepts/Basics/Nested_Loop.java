package Basics;

import java.util.Scanner;

public class Nested_Loop {
    public static void main(String[] args) {
        // nested loops 

//        for (int i = 1; i <= 3; i++) {    // rows outer loop
//            for (int j = 1; j <=9; j++)  // columns inner loop
//                {
//                    System.out.print(i + " ");
//                    System.out.print(j + " ");
//                }
//            System.out.println();
//        }

        Scanner sc= new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        columns = sc.nextInt();
        System.out.print("Enter symbol u want: ");
        symbol = sc.next().charAt(0);

        for (int i = 0 ; i< rows ; i++){ // outer for rows
            for (int j = 0; j < columns; j++) {  // inner for columns
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
