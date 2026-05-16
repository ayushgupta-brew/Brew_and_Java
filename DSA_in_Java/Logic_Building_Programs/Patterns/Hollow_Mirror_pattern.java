package Logic_Building_Programs.Patterns;

import java.util.Scanner;

public class Hollow_Mirror_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }

    public static void pattern(int num) {

        int star = num / 2 + 1;
        int space = 1;

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= star; l++) {
                System.out.print("*");
            }

            if (i <= num / 2) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            System.out.println();
        }
    }
}
