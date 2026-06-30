package Arrays_and_2dArrays.One_D_Array;

public class Even_Odd_Placement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        multiplyOddplusEven(arr);
        for(int i : arr){
            System.out.print(i  + " ");
        }

        System.out.println();

        int[] arr2 = {3, 6, 12, 1, 5, 8};

        evenoddRearrange(arr2 , arr2.length);
        for (int i : arr2){
            System.out.print(i + " ");
        }

    }

    public static void multiplyOddplusEven(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
    }
    public static void evenoddRearrange(int[] arr , int N) {
        N = arr.length;

        int e = 0;
        int o = 1;

        while (e < N && o < N) {
            if (arr[e] % 2 == 0) {
                e += 2;
            } else if (arr[o] % 2 == 1) {
                o += 2;
            } else {
                int temp = arr[e];
                arr[e] = arr[o];
                arr[o] = temp;
            }
        }
    }
}
