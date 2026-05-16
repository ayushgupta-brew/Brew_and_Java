package Logic_Building_Programs;

import java.util.Scanner;
public class Sum_n_Natural_no {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        // with formula - n(n + 1) / 2 = sum of n natural numbers

//        result = n * (n + 1) / 2;

//        System.out.print(result);

        // without formula

        for(int i = 1 ; i<=n ; i++){
            result = result + i;
        }
            System.out.println(result);
    }
}
