package Strings;
// e -> i replace hello -> hillo
import java.util.Scanner;

public class Replace_Character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String original = sc.nextLine();
        String result = "";
//        String result = original.replace('e' , 'i'); function to repeat

        for(int i = 0 ; i<original.length(); i++){
            if(original.charAt(i) == 'e'){
                result += 'i';
            }
            else{
                result = result+original.charAt(i);
            }
        }
        System.out.println(result);
    }
}
