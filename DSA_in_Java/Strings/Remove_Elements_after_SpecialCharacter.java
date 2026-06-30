package Strings;
// ayush@gmail.com -> after removing all elements after '@' -> ayush (output)

import java.util.Scanner;
public class Remove_Elements_after_SpecialCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();
        String username ="";

        for(int i = 0 ; i< email.length(); i++){
            if(email.charAt(i) == '@') {

                username += email.substring(0, i);
            }
//                break;
//            username += email.charAt(i);

        }
        System.out.println("username after removing all characters after '@': " + username);
    }
}
