package Logic_Building_Programs;
import java.util.Scanner;
public class power_ofNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int result = 1;  // becoz if power = 0, and we know power 0 always give 1

        // using math.pow() function
//        System.out.print((int)Math.pow(base , power));

        for(int i = 1 ; i <= power ; i++){
            result = result * base;
        }
        System.out.print(result);
    }
}
