package Basics;

public class Break_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;  // using break statement here we break the loop
            }
            System.out.print(i + " ");
        }    for (int j = 0; j < 10; j++) {
            if (j == 5){
                continue;  // using continue statement here we skip the condition written
            }
            System.out.print(j + " ");
        }
    }
}
