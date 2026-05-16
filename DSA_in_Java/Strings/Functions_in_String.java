package Strings;

public class Functions_in_String {
    public static void main(String[] args){
        String name = "Ayush";
        String newName = name +" "+ "Gupta";   // concatenation means add

        System.out.println(newName);
        System.out.println(newName.length());  // length of the string - 11
        System.out.println(newName.charAt(6)); // character at index - G
        System.out.println(newName.toLowerCase());
        System.out.println(newName.toUpperCase());
        System.out.println(newName.substring(2 , 11));

//        String[] a = {"ayush" , "rajesh" , "nisha"};
        String a = "ayush";

        for(int i = 0 ; i < a.length() ; i++){
            System.out.println(a.charAt(i) + " " + " = " + i);
        }


        String compare1 = "ayush";
        String compare2 = "ayush";

        if(compare1.compareTo(compare2) == 0){  // comparing the values
            System.out.println("Strings are same");
        }
        else{
            System.out.println("Strings are not same");
        }
    }
}
