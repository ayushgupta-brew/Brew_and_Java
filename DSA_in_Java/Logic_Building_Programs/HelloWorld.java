package Logic_Building_Programs;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String name = sc.nextLine();

    System.out.println("Hello " + name);

    sc.close();
    }
}