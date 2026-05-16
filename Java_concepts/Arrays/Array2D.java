package Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr =  new int[3][3];

        for (int i = 0; i < 3 ; i++){ // it will print the number of times the loop will go
            for (int j = 0; j < 3 ; j++) {  // it will print the value
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
