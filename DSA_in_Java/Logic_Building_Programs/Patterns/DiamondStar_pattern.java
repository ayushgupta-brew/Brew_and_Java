package Logic_Building_Programs.Patterns;
import java.util.Scanner;
public class DiamondStar_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n/2;
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<= space; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<= star; k++){
                System.out.print("*");
            }
            if (i <= n/2){
                star = star + 2;
                space = space - 1;
            }
            else{
                star = star -2;
                space = space + 1;
            }
            System.out.println();
        }
    }
}
