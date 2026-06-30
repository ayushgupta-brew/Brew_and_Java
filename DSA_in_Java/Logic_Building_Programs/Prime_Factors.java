package Logic_Building_Programs;
import java.util.Scanner;
public class Prime_Factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2 ; i <= n  ; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                n = n/i; // factors ko remove karne ke liye
            }
        }
    }
}
