package Logic_Building_Programs.Patterns;

import java.util.Scanner;
public class Rhombus_Star_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        for(int i = 1 ; i<= rows ; i++){
            for(int j = 1 ; j<= i-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=cols ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
