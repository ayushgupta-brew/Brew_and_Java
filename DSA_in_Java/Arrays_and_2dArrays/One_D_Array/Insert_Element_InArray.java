package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;
public class Insert_Element_InArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = {1 , 2 , 3 , 5 , 6};
        int index = sc.nextInt(); // insert at that index
        int key = sc.nextInt(); // key to insert in array
        int[] newArr = new int[arr.length + 1];

        for(int i = 0 ; i< newArr.length; i++){
            if(i < index){
                newArr[i] = arr[i];
            }
            else if(i == index){
                newArr[i] = key;
            }
            else{
                newArr[i] = arr[i - 1];
            }
        }
        for(int x : newArr){
            System.out.print(x + " ");
        }
    }
}
