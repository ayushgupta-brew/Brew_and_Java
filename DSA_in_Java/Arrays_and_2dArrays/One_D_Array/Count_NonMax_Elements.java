package Arrays_and_2dArrays.One_D_Array;
import java.util.Scanner;
public class Count_NonMax_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i = 1 ; i<n ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            if(a[i] == max){
                count++;
//                continue;
            }
//            System.out.print(a[i] + " ");
        }
        int result  = n - count;
        System.out.println(result);
    }
}
