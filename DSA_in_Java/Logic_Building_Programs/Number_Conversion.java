package Logic_Building_Programs;
import java.util.Scanner;
public class Number_Conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        StringBuilder sb = new StringBuilder();
        String binary = "";

        while(n > 0){
            int bit = n % 2;
            binary = bit + binary;
//            sb.append(n % 2);
            n = n / 2;
        }
//        sb.reverse();
//        System.out.print(sb);
        System.out.print(binary);
    }
}
