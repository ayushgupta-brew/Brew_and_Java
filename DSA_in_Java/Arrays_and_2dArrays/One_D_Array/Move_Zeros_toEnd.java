package Arrays_and_2dArrays.One_D_Array;

public class Move_Zeros_toEnd {
    public static void main(String[] args) {
        int[] a = {1 , 2 , 0 , 4 , 3 , 0 , 5 , 0};
        int n = a.length;
        int j = -1;
        for(int i = 0 ; i<n ; i++){
            if(a[i] == 0){
                j=i;
                break;
            }
        }
        for(int i = j ; i<n-1 ; i++){
            if(a[i+1] != 0){
                int temp = a[i+1];
                a[i+1] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for (int k : a) {
            System.out.print(k + " ");
        }
    }
}
