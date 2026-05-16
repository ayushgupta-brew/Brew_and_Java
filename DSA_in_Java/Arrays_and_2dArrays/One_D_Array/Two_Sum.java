package Arrays_and_2dArrays.One_D_Array;
import java.util.Scanner;
public class Two_Sum {                        // Brute Force O(n^2)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i< n ; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Calculation1(a , k , n);
//        Calculation2(a , k , n);

    }
    public static void Calculation1(int[] a , int k , int n){
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(a[i] + a[j] == k){
                    System.out.print(a[i] + " " + a[j]);
                    return;
                }
            }
        }
    }
    public static void Calculation2(int[] a , int k , int n){
        boolean flag = false;
        for(int i = 0 ; i<n && !flag ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(a[i] + a[j] == k){
                    System.out.print(a[i] + " " + a[j]);
                    flag = true;
                    break;
                }
            }
        }
    }
}
