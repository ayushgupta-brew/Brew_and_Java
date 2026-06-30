package Strings;

import java.util.Scanner;

public class StringBuilder_formation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();

        StringBuilder sb = new StringBuilder(capacity); // StringBuilder formation

        for (int i =0 ; i< 5; i++){ // append elements
            sb.append(i + 1);
        }
        System.out.println(sb);

        for(int i = 0 ; i<sb.length() ; i++){ // delete elements after character found
            if(sb.charAt(i) == '3')
                sb.delete(i+1 , sb.length());
        }
        System.out.println(sb);

        for(int i = 0 ; i< sb.length() ; i++){ // replace character
            if(sb.charAt(i) == '3')
                sb.setCharAt(i , '6');
        }
        System.out.println(sb);

        System.out.println(sb.capacity()); // capacity - 5
        System.out.println(sb.length()); // length - 0 initial agr elements nhi hai to
    }
}
