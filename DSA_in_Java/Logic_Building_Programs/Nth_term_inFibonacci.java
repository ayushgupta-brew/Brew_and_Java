package Logic_Building_Programs;

import java.util.Scanner;

public class Nth_term_inFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int a = 0;
        int b = 1;
        boolean found = false;

        // checking first two terms
        if (a == target || b == target) {
            found = true;
            System.out.print("Found");
            return;
        }

        for (int i = 2; i < n; i++) {
            int next = a + b;

            if (next == target) {
                found = true;
            }

            a = b;
            b = next;
        }

        // result
        System.out.println(found ? "Found" : "Not Found");
    }
}
