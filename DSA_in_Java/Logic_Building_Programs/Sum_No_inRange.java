package Logic_Building_Programs;

// mathematical formula - for range n1 to n2 -> n2 * (n2 + 1) / 2 - n1 * (n1 + 1) / 2 + n1

import java.util.Scanner;
public class Sum_No_inRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;

        if(n1 == n2) {  // agar range same ho to start value print
            sum += n1;
            System.out.print(sum);
            return;
        }

        int start = Math.min(n1 , n2); // range small se big ho ya vice-versa, work karega same
        int end = Math.max(n1 , n2);

        while(start < end){  // 5 + 10 + 6 + 9 + 7 + 8 = range(5 , 10) example
            sum += start + end;
            start++;
            end--;
        }

        if(start == end){  // odd place ka number means middle element ko add karne ke liye
            sum += start;
        }
        System.out.print(sum);
    }
}
