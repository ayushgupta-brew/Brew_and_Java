package Logic_Building_Programs;
import java.util.Scanner;
public class Armstrong_inRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = n1 ; i <= n2 ; i++){
            int count = 0 ;
            int temp = i;
            int sum = 0;

            while(temp > 0){
                count++;
                temp = temp / 10;
            }
            temp = i;
            while(temp > 0){

                int digit = temp % 10;
                sum = sum + (int)Math.pow(digit , count);
                temp = temp / 10;
            }
            if(sum == i){
                System.out.print(i + " ");
            }
        }
    }
}
