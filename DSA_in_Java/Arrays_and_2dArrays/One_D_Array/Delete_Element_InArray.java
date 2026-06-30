package Arrays_and_2dArrays.One_D_Array;
import java.util.Scanner;
public class Delete_Element_InArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = {1 , 2 , 3 , 4};
        int index = sc.nextInt();  // element delete of index
        int[] newArr = new int[arr.length - 1];

        int j = 0;
        for(int i = 0  ; i < arr.length ; i++){
           if(i == index){
               continue;
           }
           else{
               newArr[j] = arr[i];
               j++;
           }
        }
        for(int x : newArr){
            System.out.print(x + " ");
        }
    }
}
