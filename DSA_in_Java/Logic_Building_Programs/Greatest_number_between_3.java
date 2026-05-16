package Logic_Building_Programs;

import java.util.Scanner;
public class Greatest_number_between_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int ans = 0;

        // ternary operator
//        ans += n1 > n2 ? n1 : n2;
//        ans = ans > n3 ? ans : n3;

        // using if-else
        if((n1 >= n2) && (n1 >= n3))  ans = n1;

        else if((n2 >= n1) && (n2 >= n3))  ans = n2;

        else  ans = n3;

        System.out.print(ans);
    }
}
