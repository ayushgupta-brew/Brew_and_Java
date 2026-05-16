package Arrays_and_2dArrays.One_D_Array;
import java.util.Scanner;
public class Sum_ofArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i : a){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
