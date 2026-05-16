package Logic_Building_Programs;

import java.util.Scanner;
public class Sum_of_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        String s = String.valueOf(n);

        for(int i = 0 ; i < s.length() ; i++){
            ans = ans + s.charAt(i) - '0';
        }
//
//        while(n > 0){
//         ans += n % 10;
//         n = n/10;
//         }

         System.out.print(ans);
    }
}
