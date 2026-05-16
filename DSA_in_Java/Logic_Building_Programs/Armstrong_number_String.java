package Logic_Building_Programs;
import java.util.Scanner;
public class Armstrong_number_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int length = s.length();
        int sum = 0;

        for(int i = 0 ; i< s.length() ; i++){
            int digit = s.charAt(i) - '0';
            sum = sum + (int)Math.pow(digit , length);
        }
        if(sum == n){
            System.out.print("Armstrong");
        }
        else {
            System.out.print("Not a Armstrong");
        }
    }
}
